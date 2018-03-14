/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param root: The root of binary tree
     * @return: An integer
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        leftDepth = (leftDepth == 0 ? Integer.MAX_VALUE : leftDepth);
        rightDepth = (rightDepth == 0 ? Integer.MAX_VALUE : rightDepth);
        return (leftDepth < rightDepth) ? (leftDepth + 1) : (rightDepth + 1);
    }
}
