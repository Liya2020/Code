package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:52
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
public class Main26 {
    /*
     * 主程序，对每个结点遍历判断
     */
    public boolean isSubStructure(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null)
            return false;
        return doesTree1HasTree2(root1, root2)|| isSubStructure(root1.left, root2)
                ||isSubStructure(root1.right, root2);
    }

    /*
     * 判断root结点开始的子树中各个结点是否相同
     */
    private boolean doesTree1HasTree2(TreeNode root1,TreeNode root2) {
        if(root2==null) return true;
        if(root1==null) return false;
        return equal(root1.val, root2.val) && doesTree1HasTree2(root1.left, root2.left)
                && doesTree1HasTree2(root1.right, root2.right);
    }

    /*
     * 判断两个浮点数是否相等
     */
    private boolean equal(double num1,double num2) {
        if(num1-num2<0.0000001 && num1-num2>-0.0000001 )
            return true;
        return false;
    }
}