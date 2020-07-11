package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */


public class Main53I {
    public int search(int [] nums , int target) {
        if(nums==null || nums.length<=0)
            return 0;
        int first = getLoc(nums, target , target-0.5);
        int last = getLoc(nums,target,target+0.5);
        return last-first;
    }

    private int getLoc(int[]arr, int k, double m){ //同样是二分查找
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)>>1;
            if(arr[mid]>m){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}