package org.mca.algoal.sorting;

import java.util.Comparator;

public class QuickSorterTest extends AbstractSortTest {

    private static final QuickSorter sorter = new QuickSorter(Comparator.naturalOrder());

    @Override
    protected Sorter getSorter() {
        return sorter;
    }
}
