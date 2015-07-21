package org.mca.algoal.sorting;

import org.mca.algoal.utils.Utils;

public class GnomeSorter<T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(T[] items) {
        for (int i = 1; i < items.length; i++) {
            for (int j = i - 1; j >= 0 && items[j + 1].compareTo(items[j]) < 0; j--) {
                Utils.swap(items, j + 1, j);
            }
        }
    }

}
