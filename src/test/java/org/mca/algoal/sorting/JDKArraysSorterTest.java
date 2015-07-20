package org.mca.algoal.sorting;

import java.util.Comparator;

public class JDKArraysSorterTest extends AbstractSortTest {

    @Override
    protected Sorter getSorter() {
        return new JDKArraysSorter(Comparator.naturalOrder());
    }

}
