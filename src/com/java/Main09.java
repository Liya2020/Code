package com.java;

import java.util.Stack;

/**
 * @author Liya
 * @create 2020-03-22 8:58
 * <p>
 * 面试题09. 用两个栈实现队列
 */
public class Main09  {

    Stack<Integer> s1, s2;

    public Main09() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }
    //栈1用来添加元素
    public void appendTail(int value) {
        s1.push(value);
    }

    //栈2用来弹出元素
    public int deleteHead() {
        if (s2.isEmpty()){
            if(s1.isEmpty()) return -1;
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

     public static void main(String[] args) {
         Main09 p =new Main09();
         p.appendTail(1);
         p.appendTail(2);
         p.deleteHead();
         p.appendTail(3);

         System.out.println(p.deleteHead());
     }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */