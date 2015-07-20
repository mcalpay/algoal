package org.mca.algoal.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public abstract class AbstractSortTest {

    protected abstract Sorter getSorter();

    protected void test(Integer[] randomNumbers) {
        IntStream.range(0, randomNumbers.length)
                .filter(i ->
                        (i + 1 < randomNumbers.length
                                && randomNumbers[i] > randomNumbers[i + 1]))
                .forEach(i -> Assert.fail("i:" + i + " " + randomNumbers[i] + ">" + randomNumbers[i + 1]));
    }

    protected int getProfilingSize() {
        return 1_000_000;
    }

    @Test
    public void testWithProfiling() throws Exception {
        Integer randomNumbers[] = SorterUtils.generateRandomIntArray(getProfilingSize());

        System.out.print("Random data:    ");
        TimePrintingSorter timePrintingSorter = new TimePrintingSorter(getSorter());
        timePrintingSorter
                .sort(randomNumbers);
        test(randomNumbers);

        System.out.print("Sorted data:    ");
        timePrintingSorter.sort(randomNumbers);
        test(randomNumbers);

        SorterUtils.reverse(randomNumbers);
        System.out.print("Reverse sorted: ");
        timePrintingSorter.sort(randomNumbers);
        test(randomNumbers);
    }

    @Test
    public void testEndValues() throws Exception {
        getSorter().sort(new Integer[]{});
    }

    @Test
    public void testZeroToTen() throws Exception {
        Integer randomNumbers[] = SorterUtils.generateUniqueRandomIntArray(100);
        getSorter().sort(randomNumbers);
        IntStream.range(0, randomNumbers.length)
                .forEach(i -> Assert.assertEquals(i, randomNumbers[i].intValue()));
    }

}
