package com.geektime.week01.homework.no26_1;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.homework.no26_1
 * Description:
 *
 * @date:2020/11/30 15:38
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums == null ||nums.length == 0) {
            return 0;
        }
        int p = 0, q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
