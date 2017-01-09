/**
 * Created by abiaps on 1/9/2017.
 */
public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int l = 0, r = 0;
        if (getHeight(root) == -1) return false;
        return true;
    }

    public static int getHeight(TreeNode root) {
        int l = 0, r = 0;
        if (root == null) return 0;
        if (root.left != null)
            l = getHeight(root.left);
        if (root.right != null)
            r = getHeight(root.right);
        if (l == -1 || r == -1) return -1;
        if (Math.abs(l - r) > 1) return -1;
        return Math.max(l, r) + 1;
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(3);
        TreeNode t6 = new TreeNode(4);
        root.left = t1;
        root.right = t4;
        t2.left = t3;
        t2.right = null;
        t1.left = t2;
        t1.right = null;
        t3.left = null;
        t3.right = null;
        t4.right = t5;
        t4.left = null;
        t5.left = null;
        t5.right = t6;
        t6.left = null;
        t6.right = null;
        System.out.print(isBalanced(root));
    }
}
