package org.mca.algoal.sorting;

import java.util.Comparator;

public class MergeSorterTest extends AbstractSortTest {

    private static final MergeSorter mergeSorter = new MergeSorter(Comparator.naturalOrder());

    @Override
    protected Sorter getSorter() {
        return mergeSorter;
    }

}
