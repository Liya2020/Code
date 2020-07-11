package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main62 {
    public int lastRemaining(int n, int m) {
        if(n<1 || m<1)
            return -1; //出错
        int last=0;
        for(int i=2;i<=n;i++){
            last=(last+m)% i;  //这里是i不是n！！！
        }
        return last;
    }
}