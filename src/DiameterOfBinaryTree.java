/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        int d = 0;
        if (root == null) return 0;
        if (root.left != null)
            d = Math.max(d, diameterOfBinaryTree(root.left));  //finds the diameter of left subtree and takes the max
        if (root.right != null)
            d = Math.max(d, diameterOfBinaryTree(root.right));  //finds the diameter of right subtree and takes the max
        return Math.max(d, longestPath(root.left) + longestPath(root.right));  //returns the longest path between any two nodes
    }

    public int longestPath(TreeNode root) {
        int l = 0, r = 0;
        if (root == null) return 0;
        if (root.left != null)
            l += longestPath(root.left);
        if (root.right != null)
            r += longestPath(root.right);
        return 1 + Math.max(l, r);
    }
}