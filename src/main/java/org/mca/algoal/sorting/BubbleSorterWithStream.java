package org.mca.algoal.sorting;

import org.mca.algoal.utils.Utils;

import java.util.stream.IntStream;

public class BubbleSorterWithStream implements Sorter {

    @Override
    public void sort(Comparable[] items) {
        IntStream.range(0, items.length)
                .forEach(i -> IntStream.range(i + 1, items.length)
                        .filter(j -> items[i].compareTo(items[j]) > 0)
                        .forEach(j -> Utils.swap(items, i, j)));
    }

}