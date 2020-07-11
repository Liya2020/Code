package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main68I {
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left,p,q);
        if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}