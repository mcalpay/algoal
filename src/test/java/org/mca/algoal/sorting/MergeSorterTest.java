package org.mca.algoal.sorting;

public class MergeSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new MergeSorter<>();

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

}
