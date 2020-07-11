package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:54
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public int[] levelOrder(TreeNode root) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
//         if (root == null)
//             return new int[0];
//         queue.offer(root);
//         TreeNode node = null;
//         while (queue.size()!=0) {
//             node = queue.poll();
//             ans.add(node.val);
//             if (node.left != null)
//                 queue.offer(node.left);
//             if (node.right != null)
//                 queue.offer(node.right);
//         }
//         int arr[]=new int[ans.size()];
//         for(int i=0;i<ans.size();i++)arr[i]=ans.get(i);
//         return arr;
//     }
// }
public class Main32II {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();//{{ add(root); }};
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            res[i] = ans.get(i);
        return res;
    }
}
