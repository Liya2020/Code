package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:55
 */
public class Main37 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("$,");
        } else {
            sb.append(root.val + ",");
            sb.append(serialize(root.left));
            sb.append(serialize(root.right));
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    int index = 0;
    TreeNode deserialize(String data) {
        TreeNode node = null;
        if (data == null || data.length() == 0)
            return node;
        int start = index;
        while (data.charAt(index) != ',')
            index++;
        if (!data.substring(start, index).equals("$")) {
            node = new TreeNode(Integer.parseInt(data.substring(start, index)));
            index++; // 这条语句位置别放错了
            node.left = deserialize(data);
            node.right = deserialize(data);
        } else {
            index++;
        }
        return node;
    }
}
