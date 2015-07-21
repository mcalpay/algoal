package org.mca.algoal.sorting;

public class HeapSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new HeapSorter<>();

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

}
