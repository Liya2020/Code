package com.java;

/**
 * @author Liya
 * @create 2020-03-29 18:58
 */
public class Main60 {
// 确定问题解的表达式。可将f(n, s) 表示n个骰子点数的和为s的排列情况总数
// 确定状态转移方程。n个骰子点数和为s的种类数只与n-1个骰子的和有关。因为一个骰子有六个点数，那么第n个骰子可能出现1到6的点数。所以第n个骰子点数为1的话，f(n,s)=f(n-1,s-1)，当第n个骰子点数为2的话，f(n,s)=f(n-1,s-2)，…，依次类推。在n-1个骰子的基础上，再增加一个骰子出现点数和为s的结果只有这6种情况！那么有：f(n,s)=f(n-1,s-1)+f(n-1,s-2)+f(n-1,s-3)+f(n-1,s-4)+f(n-1,s-5)+f(n-1,s-6)
// 上面就是状态转移方程，已知初始阶段的解为：当n=1时, f(1,1)=f(1,2)=f(1,3)=f(1,4)=f(1,5)=f(1,6)=1。

    public double[] twoSum(int n) {
        if(n==0)
            return new double[0];
        double[] dp=new double[6*n+1];
        double[] ans=new double[5*n+1];
        double all=Math.pow(6,n);
        for(int i=1;i<=6;i++){
            dp[i]=1;
            ans[i-1]=1.0/6;
        }
        for(int i=2;i<=n;i++){
            for(int j=6*n;j>=1;j--){
                int temp=0;
                for(int k=1;k<=6;k++){
                    temp+=(j>=k)?dp[j-k]:0;
                }
                dp[j]=temp;
                if(i==n && j>=n){
                    ans[j-i]=dp[j]/all;
                }
            }
        }
        return ans;
    }
}