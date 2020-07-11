package com.java;

import java.util.Scanner;

/**
 * @author Liya
 * @create 2020-03-21 18:25
 * 面试题05： 替换空格
 */
public class Main05 {
    private String replaceSpace(StringBuffer str){
        String res = "%20";
        StringBuffer ans = new StringBuffer();
        //StringBuffer线程安全，可以用StringBuilder（不安全）
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                ans.append(str.charAt(i));
            }else{
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer bf = new StringBuffer();
        bf.append(scan.nextLine());

        System.out.println(new Main05().replaceSpace(bf));
    }
}
