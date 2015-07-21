package org.mca.algoal.sorting;

import org.junit.Assert;
import org.junit.Test;
import org.mca.algoal.utils.Utils;

import java.util.stream.IntStream;

public abstract class AbstractSortTest {

    protected abstract Sorter getSorter();

    protected void test(Integer[] randomNumbers) {
        IntStream.range(0, randomNumbers.length)
                .filter(i -> (i + 1 < randomNumbers.length
                        && randomNumbers[i] > randomNumbers[i + 1]))
                .forEach(i -> Assert.fail("i:" + i + " " + randomNumbers[i] + ">" + randomNumbers[i + 1]));
    }

    protected int getProfilingSize() {
        return 1_000_000;
    }

    @Test
    public void testWithProfiling() throws Exception {
        Integer randomNumbers[] = Utils.generateRandomIntArray(getProfilingSize());

        RSRTimePrintingSorter timePrintingSorter = new RSRTimePrintingSorter();
        timePrintingSorter.setPrefix("Random data:   ");
        timePrintingSorter
                .sort(randomNumbers);
        test(randomNumbers);

        timePrintingSorter.setPrefix("Sorted data:   ");
        timePrintingSorter.sort(randomNumbers);
        test(randomNumbers);

        Utils.reverse(randomNumbers);

        timePrintingSorter.setPrefix("Reverse sorted:");
        timePrintingSorter.sort(randomNumbers);
        test(randomNumbers);
    }

    @Test
    public void testEndValues() throws Exception {
        getSorter().sort(new Integer[]{});
    }

    @Test
    public void testZeroToHundred() throws Exception {
        Integer randomNumbers[] = Utils.generateUniqueRandomIntArray(100);
        getSorter().sort(randomNumbers);
        IntStream.range(0, randomNumbers.length)
                .forEach(i -> Assert.assertEquals(i, randomNumbers[i]));
    }

    private class RSRTimePrintingSorter extends TimePrintingSorter {

        private String prefix;

        public RSRTimePrintingSorter() {
            super(AbstractSortTest.this.getSorter());
        }

        @Override
        protected void doPrint(String sorterName, long timeSpent, int length) {
            System.out.println(prefix + " " + sorterName + " " + length + " elements in " + timeSpent + " milliseconds");
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }
    }
}
