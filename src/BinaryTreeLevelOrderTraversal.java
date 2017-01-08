import java.util.ArrayList;
import java.util.List;

/**
 * Created by abiaps on 1/7/2017.
 */
public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> biglist = new ArrayList<List<Integer>>();
        if (root == null) return biglist;
        List<Integer> list = new ArrayList<Integer>();
        list.add(root.val);
        biglist.add(new ArrayList<Integer>(list));
        if (root.left == null && root.right == null) return biglist;
        List<TreeNode> l = new ArrayList<TreeNode>();
        list.clear();
        if (root.left != null) {
            l.add(root.left);
            list.add(root.left.val);
        }
        if (root.right != null) {
            l.add(root.right);
            list.add(root.right.val);
        }
        biglist.add(new ArrayList<Integer>(list));
        list.clear();
        int size = l.size() * 2, count = 0;
        List<TreeNode> child = new ArrayList<TreeNode>();
        while (l != null) {
            while (count < size) {
                getChild(l.get(0), child, count);
                count = count + 2;
                l.remove(l.get(0));
            }
            l.clear();
            if (child.size() != 0) {
                l.addAll(child);
                for (int i = 0; i < child.size(); i++) list.add(child.get(i).val);
                biglist.add(new ArrayList<Integer>(list));
                list.clear();
                child.clear();
                count = 0;
                size = l.size() * 2;
            } else break;
        }
        return biglist;
    }

    public static void getChild(TreeNode root, List<TreeNode> child, int count) {
        if (root.left != null)
            child.add(root.left);
        if (root.right != null)
            child.add(root.right);
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
        System.out.println(levelOrder(root));
    }
}
