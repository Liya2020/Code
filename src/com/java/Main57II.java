package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main57II {
    public int[][] findContinuousSequence(int target) {

        List<int[]> result = new ArrayList<>();
        int i = 1;

        while(target>0)
        {
            target -= i++;
            if(target>0 && target%i == 0)
            {
                int[] array = new int[i];
                for(int k = target/i, j = 0; k < target/i+i; k++,j++)
                {
                    array[j] = k;
                }
                result.add(array);
            }
        }
        Collections.reverse(result);
        return result.toArray(new int[0][]);
    }
}