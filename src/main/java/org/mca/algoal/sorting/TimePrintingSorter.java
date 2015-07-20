package org.mca.algoal.sorting;

public class TimePrintingSorter<T> implements Sorter<T> {

    private Sorter<T> sorter;

    public TimePrintingSorter(Sorter<T> sorter) {
        this.sorter = sorter;
    }

    @Override
    public void sort(T[] items) {
        long start = System.currentTimeMillis();
        sorter.sort(items);
        long end = System.currentTimeMillis();
        System.out.println(sorter.getClass().getName() + " sorted, " + items.length + " elements in " + (end - start) + " milliseconds");
    }
}
