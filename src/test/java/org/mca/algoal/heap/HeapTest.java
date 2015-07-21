package org.mca.algoal.heap;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HeapTest {

    @Test
    public void testMaxHeap() throws Exception {
        Integer[] test = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        Heap.buildMaxHeap(test, 10);
        Assert.assertTrue(Arrays.equals(new Integer[]{16, 14, 10, 8, 7, 9, 3, 2, 4, 1}, test));
    }

    @Test
    public void testMaxHeapify() throws Exception {
        Integer[] test = {10, 14, 16};
        Heap.maxHeapify(test, 0, 3);
        Assert.assertEquals(16, test[0]);
        Assert.assertTrue(Arrays.equals(new Integer[]{16, 14, 10}, test));
    }
}
