import java.util.Scanner;

/**
 * Created by abiaps on 4/6/2017.
 */
public class LeastCommonAncestor {
    static boolean v1 = false, v2 = false;

    public static TreeNode findLeastCommonAncestor(TreeNode node, int n1, int n2) {
        if (node == null) return null;
        if (node.val == n1) {
            v1 = true;
            return node;
        }
        if (node.val == n2) {
            v2 = true;
            return node;
        }
        TreeNode left = findLeastCommonAncestor(node.left, n1, n2);
        TreeNode right = findLeastCommonAncestor(node.right, n1, n2);
        if (left != null && right != null) return node;
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        root.left = t1;
        root.right = t2;
        TreeNode t3 = new TreeNode(4);
        t1.left = t3;
        TreeNode t4 = new TreeNode(5);
        t1.right = t4;
        TreeNode t5 = new TreeNode(6);
        t2.left = t5;
        TreeNode t6 = new TreeNode(7);
        t2.right = t6;
        TreeNode lca = findLeastCommonAncestor(root, 4, 5);
        if (v2 && v1) System.out.println("The least common ancestor of 4 and 5 is" + lca.val);
        else
            System.out.println("One of the elements is not found");
        v2 = false;
        v1 = false;
        TreeNode lca1 = findLeastCommonAncestor(root, 6, 7);
        if (v2 && v1) System.out.println("The least common ancestor of 6 and 7 is" + lca1.val);
        else
            System.out.println("One of the elements is not found");
        v2 = false;
        v1 = false;
        TreeNode lca2 = findLeastCommonAncestor(root, 4, 7);
        if (v2 && v1) System.out.println("The least common ancestor of 4 and 7 is" + lca2.val);
        else
            System.out.println("One of the elements is not found");
        v2 = false;
        v1 = false;
        TreeNode lca3 = findLeastCommonAncestor(root, 4, 9);
        if (v2 && v1) System.out.println("The least common ancestor of 4 and 89 is" + lca3.val);
        else
            System.out.println("One of the elements is not found");
    }
}
