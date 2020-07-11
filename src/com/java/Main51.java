package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */

public class Main51 {
    public int reversePairs(int [] nums) {
        if(nums==null || nums.length<=0)
            return 0;
        int count=getCount(nums,0,nums.length-1);
        return count;
    }

    private int getCount(int[] array,int start,int end){
        if(start>=end)
            return 0;
        int mid=(end+start)>>1;
        int left=getCount(array,start,mid);
        int right=getCount(array,mid+1,end);

        //合并
        int count=0;
        int i=mid; //左边区域的指针
        int j=end; //右边区域的指针
        int[] temp= new int[end-start+1];  //临时区域
        int k=end-start; //临时区域的指针
        while(i>=start && j>=mid+1){
            if(array[i]>array[j]){
                count+=(j-mid);
                temp[k--]=array[i--];
            }else{
                temp[k--]=array[j--];
            }
        }
        while(i>=start)
            temp[k--]=array[i--];
        while(j>=mid+1)
            temp[k--]=array[j--];
        for(k=0;k<temp.length;k++)
            array[k+start]=temp[k];

        return count+left+right;
    }
}