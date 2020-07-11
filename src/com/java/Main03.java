package com.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Liya
 * @create 2020-04-06 13:32
 * 面试题03. 数组中重复的数字
 * 思路：
 */
public class Main03 {
    //如果没有重复数字，那么正常排序后，数字i应该在下标为i的位置，
    // 所以思路是重头扫描数组，遇到下标为i的数字如果不是i的话，
    // （假设为m),那么我们就拿与下标m的数字交换。在交换过程中，如果有重复的数字发生，那么终止返回ture

    public static int findRepeatNumber(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return -1;
    }
    //hashmap的key
    public static int findRepeatNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            } else {
                map.put(nums[i], 0);
            }
        }
        return -1;
    }
    //set的特性
    public static int findRepeatNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

}
