package org.mca.algoal.sorting;

public class InsertionSorterTest extends AbstractSortTest {

    private static final Sorter sorter = new InsertionSorter();

    @Override
    protected Sorter getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }

}