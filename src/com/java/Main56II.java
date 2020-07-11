package com.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main56II {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
                continue;
            }
            map.put(i, map.get(i) + 1);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}