package com.geektime.week01.practical.no283_1;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.practical.no283_1
 * Description:
 *
 * @date:2020/11/30 12:17
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
