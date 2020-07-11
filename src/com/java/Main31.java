package com.java;

import java.util.Stack;

/**
 * @author Liya
 * @create 2020-03-29 18:53
 */

public class Main31 {
    public boolean validateStackSequences(int [] pushA,int [] popA) {
        if(pushA.length==0 && popA.length==0)
            return true;
        Stack<Integer> stack = new Stack<Integer>();
        //必须提前判断长度是否相等
        if(popA.length!=pushA.length || pushA.length==0)
            return false;
        int popIndex=0;
        for(int pushIndex=0; pushIndex<pushA.length; pushIndex++) {
            stack.push(pushA[pushIndex]);
            while(!stack.empty() &&stack.peek()==popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }
}
