package org.mca.algoal.search;

import java.util.Arrays;

public class BinarySearchTree {

    private TreeNode root;

    public void insert(TreeNode newNode) {
        if (root == null) {
            root = newNode;
        } else {
            TreeNode node = root;
            while (node != null) {
                int comparison = node.compareTo(newNode);
                if (comparison == 0) {
                    node.setValue(newNode.getValue());
                    break;
                } else if (comparison > 0) {
                    if (node.getLeft() == null) {
                        node.setLeft(newNode);
                        break;
                    } else {
                        node = node.getLeft();
                    }
                } else {
                    if (node.getRight() == null) {
                        node.setRight(newNode);
                        break;
                    } else {
                        node = node.getRight();
                    }
                }
            }
        }
    }

    public TreeNode find(Comparable key) {
        TreeNode node = root;
        while (node != null) {
            int comparison = node.getKey().compareTo(key);
            if (comparison == 0) {
                return node;
            } else if (comparison > 0) {
                node = node.getLeft();
            } else {
                node = node.getRight();
            }
        }
        return null;
    }


    public void insert(org.mca.algoal.search.TreeNode[] nodes) {
        Arrays.stream(nodes).forEach(node -> insert(node));
    }

    public void traverse(NodeCallback nodeCallback) {
        traverse(root, nodeCallback);
    }

    private void traverse(TreeNode node, NodeCallback nodeCallback) {
        if (node != null) {
            traverse(node.getLeft(), nodeCallback);
            nodeCallback.doOnNode(node);
            traverse(node.getRight(), nodeCallback);
        }
    }

    public boolean isBST(Comparable min, Comparable max) {
        return isBST(root, min, max);
    }

    private boolean isBST(TreeNode node, Comparable min, Comparable max) {
        if (node == null) {
            return true;
        } else if (node.getKey().compareTo(min) < 0 || node.getKey().compareTo(max) > 0) {
            return false;
        }

        return isBST(node.getLeft(), min, node.getKey()) && isBST(node.getRight(), node.getKey(), max);
    }

}
