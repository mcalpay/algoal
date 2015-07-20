package org.mca.algoal.sorting;

import java.util.Comparator;

public class JDKArraysSorterTest extends AbstractSortTest {

    private static final JDKArraysSorter jdkArraysSorter = new JDKArraysSorter(Comparator.naturalOrder());

    @Override
    protected Sorter getSorter() {
        return jdkArraysSorter;
    }

}
