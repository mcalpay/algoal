package org.mca.algoal.sorting;

import java.util.Comparator;

public class MergeSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new MergeSorter<>(Comparator.<Integer>naturalOrder());

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

}
