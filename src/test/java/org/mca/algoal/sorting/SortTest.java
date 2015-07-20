package org.mca.algoal.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.Random;

public class SortTest {

    private static final int SIZE = 1_000_000;

    @Test
    public void testArraysSort() throws Exception {
        Integer randomNumbers[] = generateRandomIntArray(SIZE);
        new TimePrintingSorter(new JDKArraysSorter(Comparator.naturalOrder()))
                .sort(randomNumbers);
        test(randomNumbers);
    }

    @Test
    public void testMergeSort() throws Exception {
        Integer randomNumbers[] = generateRandomIntArray(SIZE);
        new TimePrintingSorter(new MergeSorter(Comparator.naturalOrder()))
                .sort(randomNumbers);
        test(randomNumbers);
    }

    @Test
    public void testGnomeSort() throws Exception {
        Integer randomNumbers[] = generateRandomIntArray(9_999);
         new TimePrintingSorter(new GnomeSorter(Comparator.naturalOrder()))
                 .sort(randomNumbers);
        test(randomNumbers);
    }

    @Test
    public void testInsertionSort() throws Exception {
        Integer randomNumbers[] = generateRandomIntArray(SIZE);
        new TimePrintingSorter(new InsertionSort(Comparator.naturalOrder()))
                .sort(randomNumbers);
        test(randomNumbers);
    }

    @Test
    public void testBubbleSort() throws Exception {
        Integer randomNumbers[] = generateRandomIntArray(9_999);
        new TimePrintingSorter(new BubbleSorter(Comparator.naturalOrder()))
                .sort(randomNumbers);
        test(randomNumbers);
    }

    private void test(Integer[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            if (i + 1 < randomNumbers.length
                    && randomNumbers[i] > randomNumbers[i + 1]) {
                Assert.fail("i:" + i + " " + randomNumbers[i] + ">" + randomNumbers[i + 1]);
            }
        }
    }

    private Integer[] generateRandomIntArray(int size) {
        Random random = new Random();
        Integer result[] = new Integer[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt();
        }
        return result;
    }

}
