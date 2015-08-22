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

    public void traverse(NodeAndParentClosure nodeCallback) {
        traverse(null, root, nodeCallback);
    }

    private void traverse(TreeNode parent, TreeNode node, NodeAndParentClosure nodeCallback) {
        if (node != null) {
            traverse(node, node.getLeft(), nodeCallback);
            nodeCallback.found(node, parent);
            traverse(node, node.getRight(), nodeCallback);
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

    public void remove(Comparable key) {
        TreeNode node = root;
        TreeNode parent = null;
        while (node != null) {
            int comparison = node.getKey().compareTo(key);
            if (comparison == 0) {
                remove(node, parent);
            } else if (comparison > 0) {
                parent = node;
                node = node.getLeft();
            } else {
                parent = node;
                node = node.getRight();
            }
        }
    }

    private void remove(TreeNode node, TreeNode parent) {
        if (node != null) {
            if (node.getLeft() == null && node.getRight() == null) {
                if (parent != null) {
                    int comparison = parent.compareTo(node);
                    if (comparison > 0) {
                        parent.setLeft(null);
                    } else {
                        parent.setRight(null);
                    }
                } else {
                    root = null;
                }
            } else if (node.getLeft() == null) {
                if (parent != null) {
                    int comparison = parent.compareTo(node);
                    if (comparison > 0) {
                        parent.setLeft(node.getRight());
                    } else {
                        parent.setRight(node.getRight());
                    }
                } else {
                    root = node.getRight();
                }
            } else if (node.getRight() == null) {
                if (parent != null) {
                    int comparison = parent.compareTo(node);
                    if (comparison > 0) {
                        parent.setLeft(node.getLeft());
                    } else {
                        parent.setRight(node.getLeft());
                    }
                } else {
                    root = node.getLeft();
                }
            } else {
                TreeNode successor = node.getRight();
                TreeNode successorparent = node;
                while (successor.getRight() != null) {
                    successorparent = successor;
                    successor = successor.getLeft();
                }
                node.setKey(successor.getKey());
                node.setValue(successor.getValue());
                remove(successor, successorparent);
            }
        }
    }
}
