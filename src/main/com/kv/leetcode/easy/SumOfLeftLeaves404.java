package main.com.kv.leetcode.easy;

/**
 * 404. Sum of Left Leaves
 * Easy
 *
 * 1411
 *
 * 140
 *
 * Add to List
 *
 * Share
 * Find the sum of all left leaves in a given binary tree.
 *
 * Example:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */

import main.com.kv.leetcode.TreeNode;

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
class SumOfLeftLeaves404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }else if(root.left!=null && root.left.left == null && root.left.right==null){
            return root.left.val+sumOfLeftLeaves(root.right);
        }else{
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }
    }
}
