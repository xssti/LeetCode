/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Node {
    int val;
    Node left;
    Node right;
    Node parent;
    
    public Node(int val, Node left, Node right, Node parent) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
}

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Node newRoot = remap(root, null);
        Node newTarget = findTarget(target, newRoot);
        List<Integer> list = new ArrayList<>();
        dfs(newTarget, 0, k, list, new HashSet<>());
        return list;
    }
    
    public Node findTarget(TreeNode target, Node node) {
        if(node == null) return null;
        if(node.val == target.val) return node;
        Node left = findTarget(target, node.left);
        Node right = findTarget(target, node.right);
        return left == null ? right : left;
    }
    
    public Node remap(TreeNode node, Node parent) {
        if(node == null) return null;
        Node n = new Node(node.val, null, null, parent);
        n.left = remap(node.left, n);
        n.right = remap(node.right, n);
        return n;
    }
    
    public void dfs(Node node, int count, int k, List<Integer> list, Set<Node> set) {
        if(node == null) return;
        if(set.contains(node)) return;
        if(count > k) return;
        if(count == k) {
            list.add(node.val);
        }
        set.add(node);
        dfs(node.left, count + 1, k, list, set);
        dfs(node.right, count + 1, k, list, set);
        dfs(node.parent, count + 1, k, list, set);
    }
}