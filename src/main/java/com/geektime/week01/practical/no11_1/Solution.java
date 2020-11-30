package com.geektime.week01.practical.no11_1;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.practical.no11
 * Description:
 *
 * @date:2020/11/30 12:08
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] > height[j] ? height[j--] : height[i++];
            max = Math.max(max, (j - i) * minHeight);
        }
        return max;
    }

}
