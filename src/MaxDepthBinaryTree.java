import java.util.ArrayList;
import java.util.List;

/**
 * Created by abiaps on 1/1/2017.
 */
public class MaxDepthBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int pathsum = 0, max = 1;
        List<Integer> res = new ArrayList<Integer>();
        findDepth(root, pathsum, res);
        if (res != null)
            max = res.get(0);
        for (int i = 1; i < res.size(); i++)
            if (res.get(i) > max) max = res.get(i);
        return max;
    }

    public static void findDepth(TreeNode root, int pathsum, List<Integer> res) {
        if (root.left != null)
            findDepth(root.left, pathsum + 1, res);
        if (root.right != null)
            findDepth(root.right, pathsum + 1, res);
        if (root.left == null && root.right == null)
            res.add(pathsum + 1);

    }

    public static void main(String args[]) {

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

        System.out.print(maxDepth(t1));

    }
}
