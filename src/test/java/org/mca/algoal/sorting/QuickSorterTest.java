package org.mca.algoal.sorting;

public abstract class QuickSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new QuickSorter<>();

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

}
