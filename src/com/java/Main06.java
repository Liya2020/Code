package com.java;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Liya
 * @create 2020-03-22 8:57
 * 面试题06. 从尾到头打印链表
 */
public class Main06 {

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        int arr[] = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        ListNode ListNode1 = new ListNode(1);
        ListNode ListNode2 = new ListNode(2);
        ListNode ListNode3 = new ListNode(3);
        ListNode ListNode4 = new ListNode(4);
        ListNode ListNode5 = new ListNode(5);
        ListNode1.next=ListNode2;
        ListNode2.next=ListNode3;
        ListNode3.next=ListNode4;
        ListNode4.next=ListNode5;
        for (int i : new Main06().reversePrint(ListNode1)) {
            System.out.println(i);
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

