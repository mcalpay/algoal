package org.mca.algoal.sorting;

public class BubbleSorterTest extends AbstractSortTest {

    private static final Sorter sorter = new BubbleSorter();

    @Override
    protected Sorter getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }
}

