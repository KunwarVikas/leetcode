package main.com.kv.leetcode.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 515. Find Largest Value in Each Tree Row
 * Medium
 * Share
 * Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
 * Example 1:
 * Input: root = [1,3,2,5,3,null,9]
 * Output: [1,3,9]
 * Example 2:
 *
 * Input: root = [1,2,3]
 * Output: [1,3]
 * Example 3:
 *
 * Input: root = [1]
 * Output: [1]
 * Example 4:
 *
 * Input: root = [1,null,2]
 * Output: [1,2]
 * Example 5:
 *
 * Input: root = []
 * Output: []
 *
 *  Constraints:
 *
 * The number of nodes in the tree will be in the range [0, 104].
 * -231 <= Node.val <= 231 - 1
 */
public class FindLargestValueInEachRow {
    /**
     * @param root
     * @return a list with max value of each row
     */
    public List<Integer> largestValues(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Integer> ret = new ArrayList<>();
        if (root == null)   return ret;
        deque.add(root);
        int queueSize = deque.size();
        while (queueSize != 0){
            int localMax = Integer.MIN_VALUE;
            for (int i = 0; i < queueSize; i++){
                TreeNode node = deque.poll();
                localMax = Math.max(localMax, node.val);
                if (node.left != null)  deque.add(node.left);
                if (node.right != null)  deque.add(node.right);
            }
            ret.add(localMax);
            queueSize = deque.size();
        }
        return ret;
    }

    /**
     *
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
}
