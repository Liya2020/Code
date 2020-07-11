package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:49
 */
public class Main17 {
    public int[] printNumbers(int n) {
        int[] res = new int[(int)Math.pow(10,n) - 1];
        for(int i = 0;i < res.length;i++){
            res[i] = i + 1;
        }
        return res;
    }
}