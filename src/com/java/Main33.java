package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:54
 */

public class Main33 {
    public boolean  verifyPostorder(int[] postorder) {
        if(postorder== null)
            return true;
        return verifyCore(postorder, 0, postorder.length-1);
    }

    private boolean verifyCore(int[] postorder,int start,int end) {
        if(start>=end)
            return true;
        //判断左子树
        int mid=start;
        while(postorder[mid]<postorder[end])
            mid++;
        //判断右子树
        for(int i=mid;i<end;i++) {
            if(postorder[i]<postorder[end])
                return false;
        }
        return verifyCore(postorder, start, mid-1)&&verifyCore(postorder, mid, end-1);
    }
}
