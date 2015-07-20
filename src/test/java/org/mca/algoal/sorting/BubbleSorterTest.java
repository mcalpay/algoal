package org.mca.algoal.sorting;

import java.util.Comparator;

public class BubbleSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new BubbleSorter<>(Comparator.<Integer>naturalOrder());

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }
}

