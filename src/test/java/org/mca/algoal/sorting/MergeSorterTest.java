package org.mca.algoal.sorting;

import java.util.Comparator;

public class MergeSorterTest extends AbstractSortTest {

    @Override
    protected Sorter getSorter() {
        return new MergeSorter(Comparator.naturalOrder());
    }

}
