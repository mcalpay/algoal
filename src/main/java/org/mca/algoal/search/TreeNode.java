package org.mca.algoal.search;

public class TreeNode implements Comparable<TreeNode> {

    private Comparable key;

    private Object value;

    private TreeNode left;

    private TreeNode right;

    public TreeNode(Comparable key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Comparable getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public int compareTo(TreeNode o) {
        return key.compareTo(o.key);
    }
}
