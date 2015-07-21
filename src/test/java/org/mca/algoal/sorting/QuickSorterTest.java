package org.mca.algoal.sorting;

public class QuickSorterTest extends AbstractSortTest {

    private static final Sorter sorter = new QuickSorter();

    @Override
    protected Sorter getSorter() {
        return sorter;
    }

}
