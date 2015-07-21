package org.mca.algoal.sorting;

import org.mca.algoal.utils.Utils;

public class BubbleSorter implements Sorter {

    @Override
    public void sort(Comparable[] items) {
        for (int i = 0; i < items.length; i++) {
            boolean swapped = false;
            for (int j = (i + 1); j < items.length; j++) {
                if (items[i].compareTo(items[j]) > 0) {
                    Utils.swap(items, i, j);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

}
