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
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        path(list, root, String.valueOf(root.val));
        return list;
    }

    private void path(List<String> list, TreeNode node, String str) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            list.add(str);
        }
        if(node.left != null) {
            path(list, node.left, str  + "->" + node.left.val);
        }
        if(node.right != null) {
            path(list, node.right, str  + "->" + node.right.val);
        }
    }
}
