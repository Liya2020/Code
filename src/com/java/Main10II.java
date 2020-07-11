package com.java;

/**
 * @author Liya
 * @create 2020-03-22 8:59
 * 斐波那契数列
 */
public class Main10II {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int[] arr = new int[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(new Main10II().fib(95));
    }
}
