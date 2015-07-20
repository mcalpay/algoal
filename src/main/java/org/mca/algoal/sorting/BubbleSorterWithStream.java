package org.mca.algoal.sorting;

import java.util.Comparator;
import java.util.stream.IntStream;

public class BubbleSorterWithStream<T> implements Sorter<T> {

    private final Comparator<T> comparator;

    public BubbleSorterWithStream(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(T[] items) {
        IntStream.range(0, items.length)
                .forEach(i -> IntStream.range(i + 1, items.length)
                        .filter(j -> comparator.compare(items[i], items[j]) > 0)
                        .forEach(j -> SorterUtils.swap(items, i, j)));
    }

}