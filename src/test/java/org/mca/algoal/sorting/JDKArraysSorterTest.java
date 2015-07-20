package org.mca.algoal.sorting;

import java.util.Comparator;

public class JDKArraysSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new JDKArraysSorter<>(Comparator.<Integer>naturalOrder());

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

}
