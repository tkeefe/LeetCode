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
    public int kthSmallest(TreeNode root, int k) {
        int[] count = new int[]{0};
        return inorder(root, k, count);
    }

    private int inorder(TreeNode nade, int k, int[] count) {
        if (nade == null) {
            return -1;
        }

        int leftResult = inorder(nade.left, k, count);
        if (leftResult != -1) {
            return leftResult;
        }

        count[0]++;
        if (count[0] == k) {
            return nade.val;
        }

        return inorder(nade.right, k, count);
    }
}