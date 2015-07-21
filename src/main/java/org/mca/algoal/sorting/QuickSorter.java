package org.mca.algoal.sorting;

import org.mca.algoal.utils.Utils;

import java.util.Random;

public class QuickSorter implements Sorter {

    @Override
    public void sort(Comparable[] items) {
        quicksort(items, 0, items.length - 1);
    }

    private Random random = new Random();

    private void quicksort(Comparable[] items, int lo, int hi) {
        if (lo < hi) {
            int p = partition(items, lo, hi);
            quicksort(items, lo, p - 1);
            quicksort(items, p + 1, hi);
        }
    }

    private int partition(Comparable[] items, int lo, int hi) {
        int pivotIndex = random.nextInt(hi - lo + 1) + lo;
        Comparable pivotValue = items[pivotIndex];
        Utils.swap(items, pivotIndex, hi);
        int storeIndex = lo;
        for (int i = lo; i <= hi - 1; i++) {
            if (items[i].compareTo(pivotValue) < 0) {
                Utils.swap(items, i, storeIndex);
                storeIndex = storeIndex + 1;
            }
        }

        Utils.swap(items, hi, storeIndex);
        return storeIndex;
    }

}