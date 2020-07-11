package com.java;

import java.util.Arrays;

/**
 * @author Liya
 * @create 2020-03-29 18:57
 */

public class Main41 {

    private int[] arr;
    private int size;
    private int length;

    public Main41() {
        size = 4096;
        arr = new int[size];
        length = 0;
    }

    public void addNum(int num) {
        // 如果需要扩容
        if (size == length) {
            size *= 2;
            arr = Arrays.copyOf(arr, size);
        }

        // 二分寻找插入位置
        int index = Arrays.binarySearch(arr, 0, length, num);
        if (index < 0) index = -index - 1;

        // 插入
        System.arraycopy(arr, index, arr, index + 1, length - index);
        arr[index] = num;

        length++;
    }

    public double findMedian() {
        return length % 2 == 0 ? (arr[(length - 1) / 2] + arr[length / 2]) / 2.0 : arr[length / 2];
    }

}
//class MedianFinder {
//    PriorityQueue<Integer> minHeap,maxHeap;
//    /** initialize your data structure here. */
//    public MedianFinder() {
//        minHeap=new PriorityQueue<Integer>(); //小顶堆，默认容量为11
//        maxHeap = new PriorityQueue<Integer>(11,new Comparator<Integer>(){ //大顶堆，容量11
//            public int compare(Integer i1,Integer i2){
//                return i2-i1;
//            }
//        });
//    }
//
//    public void addNum(int num) {
//        if(((minHeap.size()+maxHeap.size())&1)==0){//偶数时,下个数字加入小顶堆
//            if(!maxHeap.isEmpty() && maxHeap.peek()>num){
//                maxHeap.offer(num);
//                num=maxHeap.poll();
//            }
//            minHeap.offer(num);
//        }else{//奇数时，下一个数字放入大顶堆
//            if(!minHeap.isEmpty() && minHeap.peek()<num){
//                minHeap.offer(num);
//                num=minHeap.poll();
//            }
//            maxHeap.offer(num);
//        }
//    }
//
//    public double findMedian() {
//        if((minHeap.size()+maxHeap.size())==0)
//            throw new RuntimeException();
//        double median;
//        if((minHeap.size()+maxHeap.size()&1)==0){
//            median=(maxHeap.peek()+minHeap.peek())/2.0;
//        }else{
//            median=minHeap.peek();
//        }
//        return median;
//    }
//}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */