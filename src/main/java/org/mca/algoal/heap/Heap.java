package org.mca.algoal.heap;

import org.mca.algoal.utils.Utils;

public class Heap {

    public static <T extends Comparable> void buildMaxHeap(T items[], int size) {
        for (int i = (size / 2) - 1; i >= 0; i--) {
            maxHeapify(items, i, size);
        }
    }

    public static <T extends Comparable> void maxHeapify(T items[], int indx, int size) {
        int swap = indx;
        int leftIndx = 2 * indx + 1;
        int rightIndx = leftIndx + 1;
        if (leftIndx < size
                && items[swap].compareTo(items[leftIndx]) < 0) {
            swap = leftIndx;
        }

        if (rightIndx < size
                && items[swap].compareTo(items[rightIndx]) < 0) {
            swap = rightIndx;
        }

        if (swap != indx) {
            Utils.swap(items, indx, swap);
            maxHeapify(items, swap, size);
        }
    }

}
