package org.mca.algoal.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class SorterUtilsTest {

    private static final JDKArraysSorter jdkArraysSorter = new JDKArraysSorter(Comparator.naturalOrder());

    protected Sorter getSorter() {
        return jdkArraysSorter;
    }

    @Test
    public void testRandomNumbers() throws Exception {
        Integer randomNumbers[] = SorterUtils.generateRandomIntArray(11);
        Assert.assertEquals(11, randomNumbers.length);
        try {
            IntStream.range(0, randomNumbers.length)
                    .filter(i -> i != randomNumbers[i].intValue()).findFirst();
        } catch (NoSuchElementException nse) {
            Assert.fail();
        }
    }

    @Test
    public void testReversingAndUniques() throws Exception {
        Integer randomNumbers[] = SorterUtils.generateUniqueRandomIntArray(11);
        Assert.assertEquals(11, randomNumbers.length);
        getSorter().sort(randomNumbers);
        IntStream.range(0, randomNumbers.length)
                .forEach(i -> Assert.assertEquals(i, randomNumbers[i].intValue()));

        IntStream.range(0, randomNumbers.length / 2)
                .forEach(i -> SorterUtils.swap(randomNumbers, i, randomNumbers.length - i - 1));

        IntStream.range(0, randomNumbers.length)
                .forEach(i -> Assert.assertEquals(i, randomNumbers[randomNumbers.length - i - 1].intValue()));
    }

}