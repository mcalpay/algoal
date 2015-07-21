package org.mca.algoal.sorting;

public class MergeSorterTest extends AbstractSortTest {

    private static final Sorter sorter = new MergeSorter();

    @Override
    protected Sorter getSorter() {
        return sorter;
    }

}
