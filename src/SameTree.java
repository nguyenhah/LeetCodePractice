/**
 * Created by hazai on 20/01/16.
 */

/*Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.*/

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
           return true;
        }

        if (p == null || q == null) {
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        return (p.val == q.val) && left && right;
    }

    public static void main(String[] args) {
        TreeNode four = new TreeNode(4);
        four.left = new TreeNode(2);
        four.right = new TreeNode(7);
        four.left.left = new TreeNode(1);
        four.left.right = new TreeNode(3);
        four.right.left = new TreeNode(6);
        four.right.right = new TreeNode(9);

        TreeNode four2 = new TreeNode(4);
        four2.left = new TreeNode(2);
        four2.right = new TreeNode(7);
        four2.left.left = new TreeNode(1);
        four2.left.right = new TreeNode(3);
        four2.right.left = new TreeNode(6);
        four2.right.right = new TreeNode(9);

        TreeNode four3 = new TreeNode(4);
        four3.left = new TreeNode(2);
        four3.right = new TreeNode(7);
        four3.left.left = new TreeNode(1);
        four3.left.right = new TreeNode(3);
        four3.right.left = new TreeNode(6);
        four3.right.right = new TreeNode(10);

        System.out.println(isSameTree(four, four2));
        System.out.println(isSameTree(four, four3));
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }
}
