package com.java;

import java.util.Arrays;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main61 {
    public boolean isStraight(int[] numbers) {
        // if(nums==null || nums.length<=0)
        //     return false;
        // Arrays.sort(nums);
        // int numberOf0 = 0;
        // int numberOfGap = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0)
        //         numberOf0++;
        // }
        // int small = numberOf0;
        // int big = numberOf0+1;
        // while(big<nums.length){
        //     if(nums[small]==nums[big])
        //         return false;
        //     numberOfGap+=nums[big++]-nums[small++]-1;
        // }
        // if(numberOf0>=numberOfGap)  //大于等于，而不是等于！
        //     return true;
        // return false;
        if(numbers==null||numbers.length==0){
            return false;
        }
        int count = 0;
        int diff = 0;
        Arrays.sort(numbers);
        for(int i = 0;i<numbers.length-1;i++){
            if (numbers[i] == 0) {
                count++;
                continue;
            }
            if (numbers[i] == numbers[i + 1]) {
                return false;
            }
            diff += numbers[i + 1] - numbers[i] - 1;
        }
        return diff<=count;
    }
}