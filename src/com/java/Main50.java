package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */

public class Main50 {
    public char firstUniqChar(String s) {
        if (s == null)
            return ' ';
        int[] repetitions = new int[256];
        for (int i = 0; i < 256; i++)
            repetitions[i] = 0;
        for (int i = 0; i < s.length(); i++) {
            int loc = (int) s.charAt(i);
            repetitions[loc] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            int loc = (int) s.charAt(i);
            if (repetitions[loc] == 1)
                return (char) loc;
        }
        return ' ';
    }
}
