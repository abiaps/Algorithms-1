import java.util.ArrayList;

/**
 * Created by abiaps on 1/8/2017.
 */
public class SumOfLeftLeaves {
    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        boolean flag = true;
        int sum = 0;
        ArrayList<Integer> l = new ArrayList<Integer>();
        if (root.left != null) findLeaf(root.left, l, flag);
        if (root.right != null) {
            flag = false;
            findLeaf(root.right, l, flag);
        }
        for (int i = 0; i < l.size(); i++)
            sum += l.get(i);
        return sum;
    }

    public static void findLeaf(TreeNode root, ArrayList<Integer> l, boolean flag) {
        if (root.left != null) {
            flag = true;
            findLeaf(root.left, l, flag);
        }
        if (root.left == null && root.right == null && flag == true)
            l.add(root.val);
        if (root.right != null) {
            flag = false;
            findLeaf(root.right, l, flag);
        }
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(0);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(1);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(-1);
        TreeNode t6 = new TreeNode(5);
        TreeNode t7 = new TreeNode(1);
        TreeNode t8 = new TreeNode(6);
        TreeNode t9 = new TreeNode(8);
        root.left = t1;
        root.right = t2;
        t2.left = t4;
        t2.right = t5;
        t1.left = t3;
        t1.right = null;
        t3.left = t6;
        t3.right = t7;
        t4.left = null;
        t4.right = t8;
        t5.left = null;
        t5.right = t9;
        t6.left = null;
        t6.right = null;
        t7.left = null;
        t7.right = null;
        t8.left = null;
        t8.right = null;
        t9.left = null;
        t9.right = null;
        System.out.println(sumOfLeftLeaves(root));
    }
}
