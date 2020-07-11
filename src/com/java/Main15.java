package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:49
 */

public class Main15 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}