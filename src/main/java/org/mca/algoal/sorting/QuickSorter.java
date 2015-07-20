package org.mca.algoal.sorting;

import java.util.Comparator;

public class QuickSorter<T> implements Sorter<T> {

    private final Comparator<T> comparator;

    public QuickSorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(T[] items) {
    }

}