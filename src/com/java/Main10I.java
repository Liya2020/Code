package com.java;

/**
 * @author Liya
 * @create 2020-03-22 8:59
 *
 * 跳台阶
 */
public class Main10I {
    public int numWays(int n) {
        if (n == 1 || n == 0) return 1;
        if (n == 2) return 2;
        int[] arr = new int[n + 1];

        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(new Main10I().numWays(7));
    }
}
