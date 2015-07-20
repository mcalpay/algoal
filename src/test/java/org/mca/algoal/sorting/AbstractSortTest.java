package org.mca.algoal.sorting;

import org.junit.Assert;
import org.junit.Test;

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
        new TimePrintingSorter(getSorter())
                .sort(randomNumbers);
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
