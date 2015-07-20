package org.mca.algoal.sorting;

import java.util.Comparator;

public class GnomeSorterTest extends AbstractSortTest {

    private static final GnomeSorter gnomeSorter = new GnomeSorter(Comparator.naturalOrder());

    @Override
    protected Sorter getSorter() {
        return gnomeSorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }

}