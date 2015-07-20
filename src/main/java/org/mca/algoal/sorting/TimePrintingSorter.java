package org.mca.algoal.sorting;

public class TimePrintingSorter<T> implements Sorter<T> {

    private Sorter<T> sorter;

    private boolean justTime = false;

    public TimePrintingSorter(Sorter<T> sorter) {
        this.sorter = sorter;
    }

    public TimePrintingSorter(Sorter<T> sorter, boolean justTime) {
        this.sorter = sorter;
        this.justTime = justTime;
    }

    @Override
    public void sort(T[] items) {
        long start = System.currentTimeMillis();
        sorter.sort(items);
        long end = System.currentTimeMillis();
        if (justTime) {
            System.out.print((end - start));
        } else {
            System.out.println(sorter.getClass().getSimpleName() + " " + items.length + " elements in " + (end - start) + " milliseconds");
        }
    }
}
