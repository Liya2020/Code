package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:49
 */

public class Main16 {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1 / x;
        if (n % 2 == 0) {
            double t = myPow(x, n / 2);
            return t * t;
        } else {
            double t = myPow(x, n / 2);
            if (n < 0) x = (1 / x);
            return t * t * x;
        }
    }
}
