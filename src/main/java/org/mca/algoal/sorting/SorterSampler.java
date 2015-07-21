package org.mca.algoal.sorting;

import org.mca.algoal.utils.Utils;

public class SorterSampler {

    public static void main(String... args) throws Exception {
        System.out.println(";Merge;JDK;Heap");
        for (int i = 1_000_000; i <= 5_000_000; i += 1_000_000) {
            System.out.print(i + ";");
            new SamplersTimePrintingSorter(new MergeSorter())
                    .sort(Utils.generateRandomIntArray(i));
            System.out.print(";");
            new SamplersTimePrintingSorter(new JDKArraysSorter())
                    .sort(Utils.generateRandomIntArray(i));
            System.out.print(";");
            new SamplersTimePrintingSorter(new HeapSorter())
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
