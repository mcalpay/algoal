package org.mca.algoal.sorting;

import org.mca.algoal.utils.Utils;

public class GnomeSorter implements Sorter {

    @Override
    public void sort(Comparable[] items) {
        for (int i = 1; i < items.length; i++) {
            for (int j = i - 1; j >= 0 && items[j + 1].compareTo(items[j]) < 0; j--) {
                Utils.swap(items, j + 1, j);
            }
        }
    }

}
