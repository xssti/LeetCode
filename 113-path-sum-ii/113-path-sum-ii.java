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
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);
        return list;
    }
    public void dfs(TreeNode root,int targetSum){
        if(root == null){
            return;
        }
        targetSum = targetSum - root.val;
        path.add(root.val);
        if(targetSum == 0 && root.left == null && root.right == null){
            list.add(new ArrayList<>(path));
        }
        dfs(root.left,targetSum);
        dfs(root.right,targetSum);
        path.remove(path.size()-1);
    }
}