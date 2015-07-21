package org.mca.algoal.sorting;

import java.util.Arrays;

public class JDKArraysSorter<T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(T[] items) {
        Arrays.sort(items);
    }
}
