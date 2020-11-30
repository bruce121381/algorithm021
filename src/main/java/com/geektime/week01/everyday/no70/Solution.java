package com.geektime.week01.everyday.no70;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.everyday.no70
 * Description:
 *
 * @date:2020/11/30 11:28
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(3));
    }

}
