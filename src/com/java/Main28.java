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
public class Main28 {
    public boolean isSymmetric(TreeNode root){
        if(root==null)
            return true; //根结点为null时，认为是对称二叉树
        return isEqual(root.left,root.right);
    }

    private boolean isEqual(TreeNode pRoot1,TreeNode pRoot2){
        if(pRoot1==null && pRoot2==null)
            return true;
        if(pRoot1==null || pRoot2==null)
            return false;
        return pRoot1.val==pRoot2.val && isEqual(pRoot1.left, pRoot2.right)
                && isEqual(pRoot1.right, pRoot2.left);
    }
}
