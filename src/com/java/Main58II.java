package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main58II {
    public String reverseLeftWords(String s,int n) {
        return s.substring(n) + s.substring(0,n);
    }
}