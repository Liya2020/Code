package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */

public class Main44 {
    public int findNthDigit(int n) {
        if (n <= 9) return n;
        double N = (double)n;
        int len = 1;
        double standard = Math.pow(10, len-1) * 9 * len;
        while (N > standard) {
            // System.out.println("N:" + N + "  standard:" + standard+"  len:"+len);
            N = N - standard;
            len++;
            standard = Math.pow(10, len-1) * 9 * len;//这一步注意越界
        }
        //以上步骤判断下标为n的数字，属于哪个自然数
        /*
            1-9 9个数，占用9x1个下标
            10-99 90个数，占用90x2个下标
            100-999 900个数，占用900x3个下标
            1000-9999 90000个数，占用9000x4个下标
            ......
        */

        int Number = (int)N/len;//求出这是从100..000开始的第几个数
        int mod = (int)N%len;//求出是数字中的第几位
        // System.out.println("number:"+Number+" mod:"+mod);
        if (mod == 0) {
            return ((int)Math.pow(10, len-1)+Number-1)%10;
        }
        else {
            int target = (int)Math.pow(10, len-1) + Number;
            String s = String.valueOf(target);
            char res = s.charAt(mod-1);
            return res-'0';
        }
    }
}