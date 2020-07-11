package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:53
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Main27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return null;
        //左右子结点交换
        TreeNode tempNode = root.left;
        root.left=root.right;
        root.right=tempNode;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}