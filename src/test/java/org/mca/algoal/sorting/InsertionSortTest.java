package org.mca.algoal.sorting;

import java.util.Comparator;

public class InsertionSortTest extends AbstractSortTest {

    private InsertionSort insertionSort = new InsertionSort(Comparator.naturalOrder());

    @Override
    protected Sorter getSorter() {
        return insertionSort;
    }

    @Override
    protected int getProfilingSize() {
        return 10_000;
    }

}