package org.mca.algoal.sorting;

public class JDKArraysSorterTest extends AbstractSortTest {

    private static final Sorter sorter = new JDKArraysSorter();

    @Override
    protected Sorter getSorter() {
        return sorter;
    }

}
