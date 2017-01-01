import java.util.ArrayList;


/**
 * Created by abiaps on 12/31/2016.
 */
public class PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int pathsum = 0;
        if (root != null)
            findPaths(root, pathsum, res);
        if (res.contains(sum))
            return true;
        return false;
    }

    public static void findPaths(TreeNode root, int pathsum, ArrayList<Integer> res) {
        if (root.left != null)
            findPaths(root.left, pathsum + root.val, res);
        if (root.right != null)
            findPaths(root.right, pathsum + root.val, res);
        if (root.left == null && root.right == null) {
            res.add(pathsum + root.val);
            pathsum = 0;
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

        boolean ans = hasPathSum(t1, 8);
        System.out.print(ans);


    }
}
