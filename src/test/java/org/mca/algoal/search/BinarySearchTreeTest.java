package org.mca.algoal.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void test() throws Exception {
        TreeNode[] nodes = {new TreeNode(5, 10), new TreeNode(3, 9), new TreeNode(23, 2), new TreeNode(2, 33),
                new TreeNode(7, 7), new TreeNode(29, 17), new TreeNode(1, 1)};
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(nodes);
        Assert.assertEquals(nodes[0], tree.find(nodes[0].getKey()));
        Assert.assertEquals(nodes[3], tree.find(nodes[3].getKey()));
//        tree.remove(nodes[0].getKey());
//        AtomicBoolean found = new AtomicBoolean(false);
//        tree.traverse(n -> {
//            if (n.getKey().equals(nodes[0].getKey())) {
//                found.set(true);
//            }
//        });

//        Assert.assertFalse(found.get());
        Assert.assertTrue(tree.isBST(0, 100));
    }

}
