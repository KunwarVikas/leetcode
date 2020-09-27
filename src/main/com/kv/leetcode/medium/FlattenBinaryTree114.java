package main.com.kv.leetcode.medium;

import main.com.kv.leetcode.TreeNode;

import java.util.Stack;

/**
 * Given a binary tree, flatten it to a linked list in-place.
 *
 * For example, given the following tree:
 *
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * The flattened tree should look like:
 *
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 */
public class FlattenBinaryTree114 {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;

        while(p != null || !stack.empty()){
            if(p.right != null){
                stack.push(p.right);
            }
            if(p.left != null){
                p.right = p.left;
                p.left = null;
            }else if(!stack.empty()){
                TreeNode temp = stack.pop();
                p.right=temp;
            }
            p = p.right;
        }

    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right =t5;
        t2.left = t3;
        t2.right = t4;
        t5.right = t6;
        FlattenBinaryTree114 flattenBinaryTree114 = new FlattenBinaryTree114();
        flattenBinaryTree114.inorder(t1);
        flattenBinaryTree114.flatten(t1);
        flattenBinaryTree114.inorder(t1);

    }

    private void inorder(TreeNode root) {
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
}
