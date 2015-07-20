package org.mca.algoal.sorting;

public class SorterUtils {

    public static void swap(Object[] numbers, int i, int j) {
        Object temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
