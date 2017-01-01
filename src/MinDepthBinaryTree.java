import java.util.ArrayList;
import java.util.List;

/**
 * Created by abiaps on 12/31/2016.
 */
public class MinDepthBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        List<Integer> res = new ArrayList<Integer>();
        int nodecount = 0;
        findPaths(root, nodecount, res);
        int min = res.get(0);
        for (int i = 1; i < res.size(); i++)
            if (res.get(i) < min)
                min = res.get(i);
        return min;


    }

    public static void findPaths(TreeNode root, int nodecount, List<Integer> res) {
        if (root.left != null)
            findPaths(root.left, nodecount + 1, res);
        if (root.right != null)
            findPaths(root.right, nodecount + 1, res);
        if (root.left == null && root.right == null) {
            res.add(nodecount + 1);
        }

    }

    public static void main(String args[]) {
        ArrayList<String> l = new ArrayList<String>();
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

        int ans = minDepth(t1);
        System.out.print(ans);


    }
}
