package org.mca.algoal.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class JDKArraysSorter<T> implements Sorter<T> {

    private final Comparator<T> comparator;

    public JDKArraysSorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(T[] items) {
        Arrays.sort(items, comparator);
    }
}
