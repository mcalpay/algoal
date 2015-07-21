package org.mca.algoal.sorting;

public class HeapSorterTest extends AbstractSortTest {

    private static final Sorter sorter = new HeapSorter();

    @Override
    protected Sorter getSorter() {
        return sorter;
    }

}
