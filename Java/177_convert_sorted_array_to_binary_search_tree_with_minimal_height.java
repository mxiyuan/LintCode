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
     * @param A: an integer array
     * @return: A tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        if(A == null || A.length == 0) {
            return null;
        }
        return help(A, 0, A.length - 1);
    }

    private TreeNode help(int[] A, int left, int right) {
        if(left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(A[mid]);
        node.left = help(A, left, mid - 1);
        node.right = help(A, mid + 1, right);
        return node;
    }
}
