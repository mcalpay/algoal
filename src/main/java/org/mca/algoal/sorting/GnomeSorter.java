package org.mca.algoal.sorting;

import java.util.Comparator;

public class GnomeSorter<T> implements Sorter<T> {

    private final Comparator<T> comparator;

    public GnomeSorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(T[] items) {
        for (int i = 1; i < items.length; i++) {
            for (int j = i - 1; j >= 0 && comparator.compare(items[j + 1], items[j]) < 0; j--) {
                SorterUtils.swap(items, j + 1, j);
            }
        }
    }

}
