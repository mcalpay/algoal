package org.mca.algoal.sorting;

import java.util.Comparator;

public class QuickSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new QuickSorter<>(Comparator.<Integer>naturalOrder());

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

}
