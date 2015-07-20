package org.mca.algoal.sorting;

import java.util.Random;

public class SorterUtils {

    public static void swap(Object[] numbers, int i, int j) {
        Object temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static Integer[] generateRandomIntArray(int size) {
        Random random = new Random();
        Integer result[] = new Integer[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt();
        }
        return result;
    }

}
