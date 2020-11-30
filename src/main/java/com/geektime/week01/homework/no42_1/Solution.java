package com.geektime.week01.homework.no42_1;

/**
 * 接雨水
 * ClassName:Solution
 * PackageName:com.geektime.week01.homework.no42_1
 * Description:
 *
 * @date:2020/11/30 19:47
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public int trap(int[] height) {
        int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0, maxArea = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    maxArea += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    maxArea += rightMax - height[right];
                }
                right--;
            }
        }
        return maxArea;
    }
}
