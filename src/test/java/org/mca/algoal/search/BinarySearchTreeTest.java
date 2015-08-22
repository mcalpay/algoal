package org.mca.algoal.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

public class BinarySearchTreeTest {

    public static final int KEY = 5;

    @Test
    public void test() throws Exception {
        TreeNode[] nodes = {new TreeNode(KEY, 10), new TreeNode(3, 9), new TreeNode(23, 2), new TreeNode(2, 33),
                new TreeNode(7, 7), new TreeNode(29, 17), new TreeNode(1, 1)};
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(nodes);
        Assert.assertTrue(tree.isBST(0, 100));
        Assert.assertEquals(nodes[0], tree.find(nodes[0].getKey()));
        Assert.assertEquals(nodes[3], tree.find(nodes[3].getKey()));
        tree.remove(KEY);
        AtomicBoolean found = new AtomicBoolean(false);
        tree.traverse((n, p) -> {
            System.out.println(n.getKey());
            if (n.getKey().equals(KEY)) {
                found.set(true);
            }
            return null;
        });

        Assert.assertFalse(found.get());
        Assert.assertTrue(tree.isBST(0, 100));
    }

}
