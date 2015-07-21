package org.mca.algoal.sorting;

public class JDKArraysSorterTest extends AbstractSortTest {

    private static final Sorter<Integer> sorter = new JDKArraysSorter<>();

    @Override
    protected Sorter<Integer> getSorter() {
        return sorter;
    }

}
