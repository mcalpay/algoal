package org.mca.algoal.sorting;

import org.mca.algoal.heap.Heap;
import org.mca.algoal.utils.Utils;

public class HeapSorter<T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(T[] items) {
        Heap.buildMaxHeap(items, items.length);
        for (int i = items.length - 1; i > 0; i--) {
            Utils.swap(items, 0, i);
            Heap.maxHeapify(items, 0, i);
        }
    }

}