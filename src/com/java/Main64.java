package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main64 {
    public int sumNums(int n) {
        int sum = n;
        boolean result = (n > 0) && ((sum += sumNums(n-1)) > 0);
        return sum;
    }
}