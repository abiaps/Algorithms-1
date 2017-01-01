/**
 * Created by abiaps on 1/1/2017.
 */
public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isEqual(root.left, root.right);
    }

    public static boolean isEqual(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left != null && right != null)
            if (left.val != right.val) return false;
        if (left == null || right == null) return false;
        return (isEqual(left.left, right.right) && isEqual(left.right, right.left));
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = null;
        t2.right = t4;
        t3.left = null;
        t3.right = null;
        System.out.print(isSymmetric(t1));
    }
}
