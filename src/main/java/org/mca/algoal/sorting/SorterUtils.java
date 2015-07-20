package org.mca.algoal.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
            result[i] = random.nextInt(Integer.MAX_VALUE);
        }
        return result;
    }

    public static Integer[] generateUniqueRandomIntArray(int size) {
        final List<Integer> sack = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            sack.add(i);
        }

        Collections.shuffle(sack);
        return sack.toArray(new Integer[0]);
    }

}
