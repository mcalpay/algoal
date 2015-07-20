package org.mca.algoal.sorting;

import java.util.Comparator;

public class InsertionSortTest extends AbstractSortTest {

    @Override
    protected Sorter getSorter() {
        return new InsertionSort(Comparator.naturalOrder());
    }

    @Override
    protected int getProfilingSize() {
        return 10_000;
    }

}