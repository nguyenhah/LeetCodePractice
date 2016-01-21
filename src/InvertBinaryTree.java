import sun.reflect.generics.tree.Tree;

/**
 * Created by hazai on 20/01/16.
 */
/*Invert a binary tree.
        FROM:
          4
        /   \
        2     7
       / \   / \
      1   3 6   9

        TO:

          4
        /   \
       7     2
      / \   / \
     9   6 3   1*/

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

    public static void main(String[] args) {
        TreeNode four = new TreeNode(4);
        four.left = new TreeNode(2);
        four.right = new TreeNode(7);
        four.left.left = new TreeNode(1);
        four.left.right = new TreeNode(3);
        four.right.left = new TreeNode(6);
        four.right.right = new TreeNode(9);
        invertTree(four);
        System.out.println(four.left.left.val);
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
