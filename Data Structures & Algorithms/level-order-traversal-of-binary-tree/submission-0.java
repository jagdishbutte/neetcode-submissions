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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        List<TreeNode> que = new ArrayList<>();

        que.add(root);
        while(!que.isEmpty()) {
            int curLength = que.size();
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < curLength; i++) {
                TreeNode popped = que.removeFirst();
                list.add(popped.val);
                if(popped.left != null) {
                    que.addLast(popped.left);
                }
                if(popped.right != null) {
                    que.addLast(popped.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
