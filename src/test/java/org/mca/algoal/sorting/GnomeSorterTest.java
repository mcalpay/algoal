package org.mca.algoal.sorting;

import java.util.Comparator;

public class GnomeSorterTest extends AbstractSortTest {

    @Override
    protected Sorter getSorter() {
        return new GnomeSorter(Comparator.naturalOrder());
    }

    @Override
    protected int getProfilingSize() {
        return 10_000;
    }

}