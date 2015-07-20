package org.mca.algoal.sorting;

import java.util.Comparator;

public class MergeSorter<T> implements Sorter<T> {

    private Comparator<T> comparator;

    public MergeSorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(T[] items) {
        for (int packetSize = 1; packetSize < items.length; packetSize *= 2) {
            for (int i = 0; i < items.length; i += (packetSize * 2)) {
                T[] left = copyArray(items, i, packetSize);
                T[] right = copyArray(items, i + packetSize, packetSize);
                merge(items, i, left, right, left.length + right.length);
            }
        }
    }

    private T[] copyArray(T[] items, int start, int packetSize) {
        if (items.length < start + packetSize) {
            packetSize = (items.length > start) ? items.length - start : 0;
        }

        T[] result = (T[]) new Object[packetSize];
        if (packetSize > 0) {
            System.arraycopy(items, start, result, 0, packetSize);
        }
        return result;
    }


    private void merge(T[] items, int start, T[] left, T[] right, int size) {
        int topleft = 0;
        int topright = 0;
        for (int i = 0; i < size; i++) {
            if (topleft == left.length) {
                items[i + start] = right[topright++];
            } else if (topright == right.length) {
                items[i + start] = left[topleft++];
            } else if (comparator.compare(left[topleft], right[topright]) < 0) {
                items[i + start] = left[topleft++];
            } else {
                items[i + start] = right[topright++];
            }
        }
    }

}
