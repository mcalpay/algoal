package org.mca.algoal.sorting;

import java.util.Comparator;

public class GnomeSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new GnomeSorter<>(Comparator.<Integer>naturalOrder());

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }

}