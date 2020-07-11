package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:56
 */

public class Main39 {
    public int majorityElement(int[] array) {
        boolean isInputInvalid = true;
        if(array==null || array.length<=0)
            return 0;
        int num=array[0];
        int count=1;
        for(int i=1;i<array.length;i++){
            if(count==0) {
                num=array[i];
                count++;
            }
            else if(array[i]==num)
                count++;
            else
                count--;
        }
        if(count>0){
            int times=0;
            for(int i=0;i<array.length;i++){
                if(array[i]==num){
                    times++;
                }
            }
            if(times*2>array.length){
                isInputInvalid=false;
                return num;
            }
        }
        return 0;
    }
}
