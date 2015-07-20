package org.mca.algoal.sorting;

import java.util.Comparator;

public class BubbleSorter<T> implements Sorter<T> {

    private final Comparator<T> comparator;

    public BubbleSorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(T[] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = (i + 1); j < items.length; j++) {
                if (comparator.compare(items[i], items[j]) > 0) {
                    SorterUtils.swap(items, i, j);
                }
            }
        }
    }

}
