package org.mca.algoal.sorting;

public class InsertionSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new InsertionSorter<>();

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }

}