/**
 * Created by abiaps on 4/7/2017.
 */
public class MirrorTree {
    public static boolean symmetrical(TreeNode left, TreeNode right) {
        if (left.val != right.val) return false;
        if (left.left == null && right.right != null || left.left != null && right.right == null) return false;
        if (left.right == null && right.left != null || left.right != null && right.left == null) return false;
        if (left.left != null && right.right != null)
            if (!symmetrical(left.left, right.right)) return false;
        if (left.right != null && right.left != null)
            if (!symmetrical(left.right, right.left)) return false;
        return true;
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left != null && root.right != null)
            return symmetrical(root.left, root.right);
        if (root.left == null && root.right == null) return true;
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2);
        root.left = t1;
        root.right = t2;
        TreeNode t3 = new TreeNode(5);
        t1.right = t3;
        TreeNode t4 = new TreeNode(5);
        t2.left = t4;
       /* TreeNode t5 = new TreeNode(4);
        t2.left = t5;
        TreeNode t6 = new TreeNode(3);
        t2.right = t6;*/
        if (root.left != null && root.right != null)
            System.out.print(isSymmetric(root));
    }
}
