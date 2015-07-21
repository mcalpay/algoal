package org.mca.algoal.sorting;

public class BubbleSorterWithStreamTest extends AbstractSortTest {

    private static final Sorter sorter = new BubbleSorterWithStream();

    @Override
    protected Sorter getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }
}

