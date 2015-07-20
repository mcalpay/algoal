package org.mca.algoal.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class AbstractSortTest {

    protected abstract Sorter getSorter();

    protected void test(Integer[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            if (i + 1 < randomNumbers.length
                    && randomNumbers[i] > randomNumbers[i + 1]) {
                Assert.fail("i:" + i + " " + randomNumbers[i] + ">" + randomNumbers[i + 1]);
            }
        }
    }

    protected int getProfilingSize() {
        return 1_000_000;
    }

    @Test
    public void testWithProfiling() throws Exception {
        Integer randomNumbers[] = SorterUtils.generateRandomIntArray(getProfilingSize());

        System.out.print("Random data: ");
        TimePrintingSorter timePrintingSorter = new TimePrintingSorter(getSorter());
        timePrintingSorter
                .sort(randomNumbers);
        test(randomNumbers);

        System.out.print("Best case  : ");
        timePrintingSorter.sort(randomNumbers);
        test(randomNumbers);

        List<Integer> aList = Arrays.asList(randomNumbers);
        Collections.reverse(aList);
        randomNumbers = aList.toArray(randomNumbers);
        System.out.print("Worst case : ");
        timePrintingSorter.sort(randomNumbers);
        test(randomNumbers);
    }

    @Test
    public void testEndValues() throws Exception {
        getSorter()
                .sort(new Integer[]{});
    }

    @Test
    public void testZeroToTen() throws Exception {
        Integer randomNumbers[] = SorterUtils.generateUniqueRandomIntArray(100);
        getSorter()
                .sort(randomNumbers);
        for (int i = 0; i < randomNumbers.length; i++) {
            junit.framework.Assert.assertEquals(i, randomNumbers[i].intValue());
        }
    }

}
