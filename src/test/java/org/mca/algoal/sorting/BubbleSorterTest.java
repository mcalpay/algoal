package org.mca.algoal.sorting;

public class BubbleSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new BubbleSorter<>();

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }
}

