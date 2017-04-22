import sun.reflect.generics.tree.Tree;

/**
 * Created by abiaps on 4/9/2017.
 */
public class FindingSuccessor {
    public static int findSuccessor(TreeNode search, TreeNode root, TreeNode parent) {
        if (search.val == 15) return -1;
        if (search.right != null)
            return findMin(search.right);
        if (search.val < root.val)
            return findSuccessor(search, root.left, root);
        else if (search.val > root.val)
            return findSuccessor(search, root.right, parent);
        return parent.val;
    }

    public static int findMin(TreeNode root) {
        while (root.left != null)
            root = root.left;
        return root.val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(12);
        root.left = t1;
        root.right = t2;
        TreeNode t3 = new TreeNode(2);
        t1.left = t3;
        TreeNode t4 = new TreeNode(6);
        t1.right = t4;
        TreeNode t5 = new TreeNode(10);
        t2.left = t5;
        TreeNode t6 = new TreeNode(14);
        t2.right = t6;
        TreeNode t7 = new TreeNode(1);
        t3.left = t7;
        TreeNode t8 = new TreeNode(3);
        t3.right = t8;
        TreeNode t9 = new TreeNode(5);
        t4.left = t9;
        TreeNode t10 = new TreeNode(7);
        t4.right = t10;
        TreeNode t11 = new TreeNode(9);
        t5.left = t11;
        TreeNode t12 = new TreeNode(11);
        t5.right = t12;
        TreeNode t13 = new TreeNode(13);
        t6.left = t13;
        TreeNode t14 = new TreeNode(15);
        t6.right = t14;
        TreeNode parent = null;
        System.out.println(findSuccessor(t14, root, parent));
    }
}
