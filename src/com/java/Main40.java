package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:56
 */

public class Main40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] leastNumbers = new int[k];
        while (arr == null || k <= 0 || k > arr.length)
            return leastNumbers;
        int start = 0;
        int end = arr.length - 1;
        int index = partition(arr, start, end);
        while (index != k - 1) {
            if (index < k - 1) {
                start = index + 1;
                index = partition(arr, start, end);
            } else {
                end = index - 1;
                index = partition(arr, start, end);
            }
        }
        for (int i = 0; i < k; i++) {
            leastNumbers[i] = arr[i];
        }
        return leastNumbers;
    }

    private int partition(int[] arr, int start, int end) {
        int pivotKey = arr[start];
        while (start < end) {
            while (start < end && arr[end] >= pivotKey)
                end--;
            swap(arr, start, end);
            while (start < end && arr[start] <= pivotKey)
                start++;
            swap(arr, start, end);
        }
        return start;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
