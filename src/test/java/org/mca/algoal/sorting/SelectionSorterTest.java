package org.mca.algoal.sorting;

import java.util.Comparator;

public class SelectionSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new SelectionSorter<>(Comparator.<Integer>naturalOrder());

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }
}

