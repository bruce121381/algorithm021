package com.geektime.week01.practical.no70_2;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.practical.no70_2
 * Description:
 *
 * @date:2020/11/30 12:20
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 1, b = 2;
        for (int i = 2; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }

}
