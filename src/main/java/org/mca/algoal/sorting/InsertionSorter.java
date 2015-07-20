package org.mca.algoal.sorting;

import java.util.Comparator;

// gnome sort?
public class InsertionSorter<T> implements Sorter<T> {

    private Comparator<T> comparator;

    public InsertionSorter(Comparator<T> comparator) {
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
