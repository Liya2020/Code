package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
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
public class Main55II {
    public boolean isBalanced(TreeNode root) {
        return getDepth(root)!=-1;
    }

    public int getDepth(TreeNode root) {
        if(root==null)    return 0;
        int left=getDepth(root.left);
        if(left==-1)    return -1;
        int right=getDepth(root.right);
        if(right==-1)    return -1;
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }
}