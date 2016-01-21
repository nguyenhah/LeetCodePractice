/**
 * Created by hazai on 19/01/16.
 */

/*Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest
path from the root node down to the farthest leaf node.*/

public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + (left > right ? left : right);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        a.left = b;
        b.left = c;
        System.out.println(maxDepth(a));
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
