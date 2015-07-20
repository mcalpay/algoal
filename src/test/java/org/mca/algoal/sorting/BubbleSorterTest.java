package org.mca.algoal.sorting;

import java.util.Comparator;

public class BubbleSorterTest extends AbstractSortTest {

    private BubbleSorter sorter = new BubbleSorter(Comparator.naturalOrder());
    ;

    @Override
    protected Sorter getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 10_000;
    }
}

