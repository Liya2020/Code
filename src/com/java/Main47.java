package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */

public class Main47 {
    public int maxValue(int[][] grid) {
        if(grid==null || grid.length<=0 ||grid[0].length<=0)
            return 0;
        int rows=grid.length;
        int cols=grid[0].length;;
        int[] maxValue=new int[cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                int left=0;
                int up=0;
                if(i>0)
                    up=maxValue[j];
                if(j>0)
                    left=maxValue[j-1];
                maxValue[j]=Math.max(up, left)+grid[i][j];
            }
        }
        return maxValue[cols-1];
    }
}