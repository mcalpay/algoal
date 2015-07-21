package org.mca.algoal.sorting;

import org.mca.algoal.utils.Utils;

public class SorterSampler {

    public static void main(String... args) throws Exception {
        System.out.println(";MergeSorter;JDK;Insertion");
        for (int i = 10_000; i <= 100_000; i += 10_000) {
            System.out.print(i + ";");
            new SamplersTimePrintingSorter(new MergeSorter())
                    .sort(Utils.generateRandomIntArray(i));
            System.out.print(";");
            new SamplersTimePrintingSorter(new JDKArraysSorter())
                    .sort(Utils.generateRandomIntArray(i));
            System.out.print(";");
            new SamplersTimePrintingSorter(new InsertionSorter())
                    .sort(Utils.generateRandomIntArray(i));
            System.out.print("\n");
        }
    }

    private static class SamplersTimePrintingSorter extends TimePrintingSorter {
        public SamplersTimePrintingSorter(Sorter sorter) {
            super(sorter);
        }

        @Override
        protected void doPrint(String sorterName, long timeSpent, int length) {
            System.out.print(timeSpent);
        }
    }
}
