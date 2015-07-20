package org.mca.algoal.sorting;

import java.util.Comparator;

public class SelectionSorter<T> implements Sorter<T> {

    private final Comparator<T> comparator;

    public SelectionSorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(T[] items) {
        for (int i = 0; i < items.length; i++) {
            int minIndex = i;
            for (int j = (i + 1); j < items.length; j++) {
                if (comparator.compare(items[minIndex], items[j]) > 0) {
                    minIndex = j;
                }
            }

            SorterUtils.swap(items, i, minIndex);
        }
    }

}