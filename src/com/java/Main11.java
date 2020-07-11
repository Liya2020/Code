package com.java;

/**
 * @author Liya
 * @create 2020-03-22 8:59
 */
public class Main11 {
    public static void main(String[] args) {
       int nums[] = new int[]{3,4,5,1,2};
        System.out.println(minArray1(nums));
    }
    public static int minArray1(int[] nums) {
        if (nums == null || nums.length <= 0) // 空数组或null时返回0
            return 0;
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        //升序数组
        if (nums[low] < nums[high])
            return nums[low];
        //中间数字与首尾数字相等
        if (nums[mid] == nums[high] && nums[mid] == nums[low]) {
            for (int i = 1; i <= high; i++) {
                if (nums[i] < nums[i - 1])
                    return nums[i];
            }
            return nums[low];
        }
        //正常情况
        while (low < high) {
            if (high - low == 1)
                break;
            mid = (low + high) / 2;
            if (nums[mid] <= nums[high])
                high = mid;
            if (nums[mid] > nums[high])
                low = mid;
        }
        return nums[high]; // 别错写成了return high; !!
    }
}
