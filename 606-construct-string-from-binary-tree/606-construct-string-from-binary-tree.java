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
    public String tree2str(TreeNode root) {
      return dfs(root);
    }
    public String dfs(TreeNode node) {
        String str = "";
        if(node == null) return str;
        str += node.val;
        if(node.left != null) {
            str += '(' + dfs(node.left);
            str += ')';
        }
        else if(node.right != null) {
            str += "()";
        }
        if(node.right != null) {
            str += '(' + dfs(node.right);
            str += ')';
        }
        return str;
    }
}