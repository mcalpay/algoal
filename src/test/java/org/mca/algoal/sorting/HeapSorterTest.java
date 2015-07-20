package org.mca.algoal.sorting;

import java.util.Comparator;

public abstract class HeapSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new HeapSorter<>(Comparator.<Integer>naturalOrder());

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

}
