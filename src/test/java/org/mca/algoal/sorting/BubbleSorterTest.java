package org.mca.algoal.sorting;

import java.util.Comparator;

public class BubbleSorterTest extends AbstractSortTest {

    @Override
    protected Sorter getSorter() {
        return new BubbleSorter(Comparator.naturalOrder());
    }

    @Override
    protected int getProfilingSize() {
        return 10_000;
    }
}

