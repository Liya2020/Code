package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main63 {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2)
            return 0;  //error
        int min=prices[0];

        //最大利润可以是负数，只要亏损最小就行
        int maxDiff=prices[1]-min;
        for(int i=1;i<prices.length;i++) {
            if(prices[i-1]<min)     //保存“之前”最小数字
                min=prices[i-1];
            if(prices[i]-min>maxDiff)
                maxDiff=prices[i]-min;
        }
        if(maxDiff<0) return 0;
        return maxDiff;
    }
}