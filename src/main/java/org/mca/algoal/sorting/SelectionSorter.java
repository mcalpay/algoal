package org.mca.algoal.sorting;

import org.mca.algoal.utils.Utils;

public class SelectionSorter<T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(T[] items) {
        for (int i = 0; i < items.length; i++) {
            int minIndex = i;
            for (int j = (i + 1); j < items.length; j++) {
                if (items[minIndex].compareTo(items[j]) > 0) {
                    minIndex = j;
                }
            }

            Utils.swap(items, i, minIndex);
        }
    }

}