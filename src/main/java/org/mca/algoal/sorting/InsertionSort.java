package org.mca.algoal.sorting;

import java.util.Comparator;

public class InsertionSort<T> implements Sorter<T> {

    private Comparator<T> comparator;

    public InsertionSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(T[] items) {
        for (int i = 1; i < items.length; i++) {
            T item = items[i];
            int j = i;
            while (j >= 1 &&
                    comparator.compare(item, items[j - 1]) < 0) {
                items[j] = items[j - 1];
                j--;
            }

            items[j] = item;
        }
    }

}
