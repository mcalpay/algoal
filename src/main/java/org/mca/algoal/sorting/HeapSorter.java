package org.mca.algoal.sorting;

import java.util.Comparator;

public class HeapSorter<T> implements Sorter<T> {

    private final Comparator<T> comparator;

    public HeapSorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(T[] items) {
    }

}