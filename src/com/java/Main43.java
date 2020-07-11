package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:57
 */

public class Main43 {
    public int countDigitOne(int n) {
        int count=0;
        for(long i=1;i<=n;i*=10){  //i代表位数
            long high=n/(i*10); //更高位数字
            long low=(n%i);  //更低位数字
            long cur=(n/i)%10;  //当前位数字
            if(cur==0){
                count+=high*i;
            }else if(cur==1){
                count+=high*i+(low+1);
            }else{
                count+=(high+1)*i;
            }
        }
        return count;
    }
}