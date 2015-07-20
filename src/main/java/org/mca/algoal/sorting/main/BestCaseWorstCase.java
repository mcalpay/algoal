package org.mca.algoal.sorting.main;

import org.mca.algoal.sorting.InsertionSort;
import org.mca.algoal.sorting.Sorter;
import org.mca.algoal.sorting.SorterUtils;
import org.mca.algoal.sorting.TimePrintingSorter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BestCaseWorstCase {

    public static void main(String... args) throws Exception {
        Integer items[] = SorterUtils.generateUniqueRandomIntArray(100_000);
        InsertionSort theSorter = new InsertionSort(Comparator.naturalOrder());
        Sorter sorter = new TimePrintingSorter(theSorter);

        System.out.print("Random data: ");
        sorter.sort(items);

        System.out.print("Best case: ");
        sorter.sort(items);

        List<Integer> aList = Arrays.asList(items);
        Collections.reverse(aList);
        items = aList.toArray(items);
        System.out.print("Worst case: ");
        sorter.sort(items);
    }

}
