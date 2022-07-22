/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left = depth(root.left);
        int right = depth(root.right);
        if((left -1 == right || right - 1 == left ||left == right) && isBalanced(root.left) && isBalanced(root.right)) return true;
        else
            return false;
    }
    public int depth(TreeNode node) {
        if(node == null) return 0;
        return 1+ Math.max(depth(node.left), depth(node.right));
    }
}