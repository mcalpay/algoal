package org.mca.algoal.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mca.algoal.sorting.JDKArraysSorter;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class UtilsTest {

    private static final JDKArraysSorter<Integer> jdkArraysSorter = new JDKArraysSorter<>();

    @Test
    public void testSwap() throws Exception {
        Integer randomNumbers[] = {0, 1};
        Utils.swap(randomNumbers, 0, 1);
        Assert.assertEquals(1, randomNumbers[0]);
        Assert.assertEquals(0, randomNumbers[1]);
    }

    @Test
    public void testRandomNumbers() throws Exception {
        Integer randomNumbers[] = Utils.generateRandomIntArray(11);
        Assert.assertEquals(11, randomNumbers.length);
        try {
            IntStream.range(0, randomNumbers.length)
                    .filter(i -> i != randomNumbers[i]).findFirst();
        } catch (NoSuchElementException nse) {
            Assert.fail();
        }
    }

    @Test
    public void testReversingAndUniques() throws Exception {
        Integer randomNumbers[] = Utils.generateUniqueRandomIntArray(11);
        Assert.assertEquals(11, randomNumbers.length);
        jdkArraysSorter.sort(randomNumbers);
        IntStream.range(0, randomNumbers.length)
                .forEach(i -> Assert.assertEquals(i, randomNumbers[i]));

        Utils.reverse(randomNumbers);
        IntStream.range(0, randomNumbers.length)
                .forEach(i -> Assert.assertEquals(i, randomNumbers[randomNumbers.length - i - 1]));
    }

}
