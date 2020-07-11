package com.java;

import java.util.ArrayList;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main57 {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (nums == null || nums.length <= 0)
            return null;
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (nums[low] + nums[high] == target) {
                list.add(nums[low]);
                list.add(nums[high]);
                break;
            } else if (nums[low] + nums[high] < target)
                low++;
            else
                high--;
        }
        int a[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }
}