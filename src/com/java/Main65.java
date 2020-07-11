package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main65 {
    public int add(int a, int b) {
        while(b!=0){
            int sum=a^b;  //没进位的和
            int carry=(a&b)<<1;  //进位
            a=sum;
            b=carry;
        }
        return a;
    }
}