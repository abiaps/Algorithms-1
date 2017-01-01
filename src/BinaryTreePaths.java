import java.util.ArrayList;
import java.util.List;

/**
 * Created by abiaps on 12/31/2016.
 */
public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        findSolution(root, "", answer);
        return answer;
    }

    public static void findSolution(TreeNode root, String elt, List<String> ans) {
        if (root.left != null)
            findSolution(root.left, elt + root.val + "->", ans);
        if (root.right != null)
            findSolution(root.right, elt + root.val + "->", ans);
        if (root.left == null && root.right == null) {
            elt += root.val;
            ans.add(elt);
            elt = "";
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

        List<String> ans = binaryTreePaths(t1);
        System.out.print(ans);


    }
}
