package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BSTModel {
    private TreeNode root;

    public BSTModel() {
        root = null;
    }

    // Insert a value into the BST then it will call a recursive helper
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }
        return node;
    }

    // Root -> Left -> Right
    public void preorder() {
        preorderRecursive(root);
    }

    private void preorderRecursive(TreeNode node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preorderRecursive(node.left);
        preorderRecursive(node.right);
    }

    // Left -> Root -> Right
    public void inorder() {
        inorderRecursive(root);
    }

    private void inorderRecursive(TreeNode node) {
        if (node == null) return;
        inorderRecursive(node.left);
        System.out.print(node.value + " ");
        inorderRecursive(node.right);
    }

    // Left -> Right -> Root
    public void postorder() {
        postorderRecursive(root);
    }

    private void postorderRecursive(TreeNode node) {
        if (node == null) return;
        postorderRecursive(node.left);
        postorderRecursive(node.right);
        System.out.print(node.value + " ");
    }

    // Breadth First
    public void levelOrder() {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.value + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    /*
     * 1. collect all the nodes into a sorted list (via inorder traversal)
     * 2. build a new tree from the middle element to ensure minimal height
     */
    public void balance() {
        ArrayList<Integer> values = new ArrayList<>();
        collectValues(root, values);
        root = buildBalancedBST(values, 0, values.size() - 1);
    }

    private void collectValues(TreeNode node, ArrayList<Integer> list) {
        if (node == null) return;
        collectValues(node.left, list);
        list.add(node.value);
        collectValues(node.right, list);
    }

    // Build the tree from sorted values
    private TreeNode buildBalancedBST(ArrayList<Integer> list, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = buildBalancedBST(list, start, mid - 1);
        node.right = buildBalancedBST(list, mid + 1, end);
        return node;
    }

    /*
     * Get the root of the BST
     * This will be used by the View to draw the tree
     */
    public TreeNode getRoot() {
        return root;
    }
}
