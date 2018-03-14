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
    /**
     * @param root: the given BST
     * @param target: the given target
     * @return: the value in the BST that is closest to the target
     */
    public int closestValue(TreeNode root, double target) {
        // write your code here
        closestNode = root;
        findClosetNode(root, target);
        if(closestNode != null) {
            return closestNode.val;
        }
        return 0;
    }

    private TreeNode closestNode;

    private void findClosetNode(TreeNode node, double target) {
        if(node == null) {
            return;
        }
        findClosetNode(node.left, target);
        if(Math.abs(node.val - target) < Math.abs(closestNode.val - target)) {
            closestNode = node;
        }
        findClosetNode(node.right, target);
    }
}
