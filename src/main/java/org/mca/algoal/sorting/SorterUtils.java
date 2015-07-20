package org.mca.algoal.sorting;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SorterUtils {

    private static final Random random = new Random();

    public static void swap(Object[] numbers, int i, int j) {
        if (i != j) {
            Object temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }

    public static Integer[] generateRandomIntArray(int size) {
        return IntStream.range(0, size).map(i -> random.nextInt(size)).boxed().toArray(Integer[]::new);
    }

    public static Integer[] generateUniqueRandomIntArray(int size) {
        final List<Integer> sack = IntStream.range(0, size).boxed().collect(Collectors.toList());
        Collections.shuffle(sack);
        return sack.toArray(new Integer[sack.size()]);
    }

    public static void reverse(Integer[] randomNumbers) {
        IntStream.range(0, randomNumbers.length / 2)
                .forEach(i -> SorterUtils.swap(randomNumbers, i, randomNumbers.length - i - 1));
    }
}
