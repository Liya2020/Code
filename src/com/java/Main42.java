package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:57
 */
public class Main42 {
    boolean InvalidInput = false;
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length<=0){
            InvalidInput = true;
            return 0;
        }
        InvalidInput = false;
        int sum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum<0)
                sum=nums[i];
            else
                sum+=nums[i];
            if(sum>maxSum)
                maxSum=sum;
        }
        return maxSum;
    }
}
