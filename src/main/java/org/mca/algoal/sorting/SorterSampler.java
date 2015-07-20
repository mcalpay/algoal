package org.mca.algoal.sorting;

import java.util.Comparator;

public class SorterSampler {

    public static void main(String... args) throws Exception {
        System.out.println(";MergeSorter;JDK;Insertion");
        for (int i = 1_000; i <= 100_000_000; i *= 10) {
            System.out.print(i + ";");
            new TimePrintingSorter(new MergeSorter(Comparator.naturalOrder()), true)
                    .sort(SorterUtils.generateRandomIntArray(i));
            System.out.print(";");
            new TimePrintingSorter(new JDKArraysSorter(Comparator.naturalOrder()), true)
                    .sort(SorterUtils.generateRandomIntArray(i));
            System.out.print(";");
            new TimePrintingSorter(new InsertionSort(Comparator.naturalOrder()), true)
                    .sort(SorterUtils.generateRandomIntArray(i));
            System.out.print("\n");
        }
    }

}
