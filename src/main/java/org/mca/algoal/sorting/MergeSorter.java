package org.mca.algoal.sorting;

public class MergeSorter<T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(Comparable[] items) {
        for (int packetSize = 1; packetSize < items.length; packetSize *= 2) {
            for (int i = 0; i < items.length; i += (packetSize * 2)) {
                Comparable[] left = copyArray(items, i, packetSize);
                Comparable[] right = copyArray(items, i + packetSize, packetSize);
                merge(items, i, left, right, left.length + right.length);
            }
        }
    }

    private Comparable[] copyArray(Comparable[] items, int start, int packetSize) {
        if (items.length < start + packetSize) {
            packetSize = (items.length > start) ? items.length - start : 0;
        }

        Comparable[] result = new Comparable[packetSize];
        if (packetSize > 0) {
            System.arraycopy(items, start, result, 0, packetSize);
        }
        return result;
    }


    private void merge(Comparable[] items, int start, Comparable[] left, Comparable[] right, int size) {
        int topleft = 0;
        int topright = 0;
        for (int i = 0; i < size; i++) {
            if (topleft == left.length) {
                items[i + start] = right[topright++];
            } else if (topright == right.length) {
                items[i + start] = left[topleft++];
            } else if (left[topleft].compareTo(right[topright]) < 0) {
                items[i + start] = left[topleft++];
            } else {
                items[i + start] = right[topright++];
            }
        }
    }

}
