class Solution {
public:
    /**
     * @param root the root of binary tree
     * @return the max node
     */
    TreeNode* maxNode(TreeNode* root) {
        TreeNode *max = root;

        std::function<void(TreeNode *)> findMax = [&](TreeNode *node) {
            if (!node) {
                return;
            }
            findMax(node->left);
            if (max->val < node->val) {
                max = node;
            }
            findMax(node->right);
        };

        findMax(root);

        return max;
    }
};