/**
 * Created by abiaps on 6/29/2017.
 */
public class ConstructStringFromBinaryTree {
    static StringBuilder sb = new StringBuilder();
    static boolean root = true;

    public static String tree2str(TreeNode t) {
        if (t == null) return "";
        if (root == true) {
            sb.append(t.val);
            root = false;
        } else sb.append("(" + t.val);
        if (t.left != null) tree2str(t.left);
        if (t.left == null && t.right != null) sb.append("()");
        if (t.right != null) tree2str(t.right);
        sb.append(")");
        return sb.substring(0, sb.length() - 1).toString();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        System.out.println(tree2str(root));
    }
}
