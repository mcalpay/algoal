package org.mca.algoal.sorting;

public class SelectionSorterTest extends AbstractSortTest {

    private static final Sorter sorter = new SelectionSorter();

    @Override
    protected Sorter getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }
}

