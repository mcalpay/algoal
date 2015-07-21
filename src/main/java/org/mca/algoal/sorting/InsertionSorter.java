package org.mca.algoal.sorting;

public class InsertionSorter<T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(T[] items) {
        for (int i = 1; i < items.length; i++) {
            T item = items[i];
            int j = i;
            while (j >= 1 &&
                    item.compareTo(items[j - 1]) < 0) {
                items[j] = items[j - 1];
                j--;
            }

            items[j] = item;
        }
    }

}
