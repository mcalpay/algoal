package org.mca.algoal.sorting;

public class GnomeSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new GnomeSorter<>();

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

    @Override
    protected int getProfilingSize() {
        return 20_000;
    }

}