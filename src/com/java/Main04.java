package com.java;

/**
 * @author Liya
 * @create 2020-03-21 19:49
 * <p>
 * 面试题04. 二维数组中的查找
 */
public class Main04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int i = 0;
        int j = matrix[0].length - 1;

        while (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
