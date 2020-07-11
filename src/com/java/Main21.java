package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:51
 */

public class Main21 {
    public int[] exchange(int[] array) {
        int length = array.length;
        int low = 0;
        int high = length - 1;
        int temp;
        while (low < high) {
            //向后移动low指针，直到它指向偶数
            while (low < length && (array[low] & 1) != 0)
                low++;
            //向前移动high指针，直到它指向奇数
            while (high >= 0 && (array[high] & 1) == 0)
                high--;
            if (low < high) {
                temp = array[low];
                array[low] = array[high];
                array[high] = temp;
            }
        }
        return array;
    }
}
