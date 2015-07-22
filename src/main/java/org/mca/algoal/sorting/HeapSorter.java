package org.mca.algoal.sorting;

import org.mca.algoal.heap.HeapUtils;
import org.mca.algoal.utils.Utils;

public class HeapSorter implements Sorter {

    @Override
    public void sort(Comparable[] items) {
        HeapUtils.buildMaxHeap(items, items.length);
        for (int i = items.length - 1; i > 0; i--) {
            Utils.swap(items, 0, i);
            HeapUtils.maxHeapify(items, 0, i);
        }
    }

}