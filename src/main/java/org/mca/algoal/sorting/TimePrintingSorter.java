package org.mca.algoal.sorting;

public class TimePrintingSorter implements Sorter {

    private final Sorter sorter;

    public TimePrintingSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    @Override
    public final void sort(Comparable[] items) {
        long start = System.currentTimeMillis();
        sorter.sort(items);
        long end = System.currentTimeMillis();
        long timeSpent = end - start;
        doPrint(sorter.getClass().getSimpleName(), timeSpent, items.length);
    }

    protected void doPrint(String sorterName, long timeSpent, int length) {
        System.out.println(sorterName + " " + length + " elements in " + timeSpent + " milliseconds");
    }

}
