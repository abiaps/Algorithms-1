/**
 * Created by abiaps on 4/6/2017.
 */
public class MedianofBST {
    static boolean flag = false;

    public static int findCount(TreeNode node) {
        int count = 0;
        if (node == null) return 0;
        else if (node != null) count++;
        count += findCount(node.left);
        count += findCount(node.right);
        return count;
    }

    public static int findMedian(TreeNode root, int num) {
        if (root == null) return 0;
        int nodeNo = 0;
        if (root.left != null) {
            nodeNo = findMedian(root.left, num);
            if (flag == false) {
                if (nodeNo == num) {
                    flag = true;
                    return root.left.val;
                }
            }
        }
        if (flag == false) {
            nodeNo++;
            if (nodeNo == num) {
                flag = true;
                return root.val;
            }
        }
        if (root.right != null) {
            if (flag == false) {
                nodeNo += findMedian(root.right, num);
                if (nodeNo == num) {
                    flag = true;
                    return root.right.val;
                }
            }
        }
        return nodeNo;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(100);
        TreeNode t1 = new TreeNode(50);
        TreeNode t2 = new TreeNode(200);
        root.left = t1;
        root.right = t2;
        TreeNode t3 = new TreeNode(10);
        t1.left = t3;
        TreeNode t4 = new TreeNode(80);
        t1.right = t4;
        TreeNode t5 = new TreeNode(150);
        t2.left = t5;
        /*TreeNode t6 = new TreeNode(250);
        t2.right = t6;*/
        int n = findCount(root);
        if (n % 2 != 0)
            System.out.println("The median of BST is " + findMedian(root, n / 2 + 1));
        else {
            int med1 = findMedian(root, n / 2 + 1);
            flag = false;
            med1 += findMedian(root, n / 2);
            System.out.print(med1 / 2);
        }

    }
}
