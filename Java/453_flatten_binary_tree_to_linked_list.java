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
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        traverse(root, list);
        for(int i = 0; i < list.size() - 1; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i + 1);
        }
        if(list.size() > 0) {
            list.get(list.size() - 1).right = null;
        }
    }

    private void traverse(TreeNode node, List<TreeNode> list) {
        if(node == null) {
            return;
        }
        list.add(node);
        traverse(node.left, list);
        traverse(node.right, list);
    }
}
