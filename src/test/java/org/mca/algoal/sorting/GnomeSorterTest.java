package org.mca.algoal.sorting;

public class GnomeSorterTest extends AbstractSortTest {

    private static final Sorter sorter = new GnomeSorter();

    @Override
    protected Sorter getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }

}