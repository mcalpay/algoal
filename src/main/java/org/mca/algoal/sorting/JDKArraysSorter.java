package org.mca.algoal.sorting;

import java.util.Arrays;

public class JDKArraysSorter implements Sorter {

    @Override
    public void sort(Comparable[] items) {
        Arrays.sort(items);
    }
}
