package org.mca.algoal.sorting;

import java.util.Comparator;

public class BubbleSorterWithStreamTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new BubbleSorterWithStream<>(Comparator.<Integer>naturalOrder());

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }
}

