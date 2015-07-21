package org.mca.algoal.sorting;

import org.mca.algoal.utils.Utils;

public class BubbleSorter<T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(T[] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = (i + 1); j < items.length; j++) {
                if (items[i].compareTo(items[j]) > 0) {
                    Utils.swap(items, i, j);
                }
            }
        }
    }

}
