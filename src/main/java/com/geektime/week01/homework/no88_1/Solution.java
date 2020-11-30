package com.geektime.week01.homework.no88_1;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.homework.no88_1
 * Description:
 *
 * @date:2020/11/30 16:10
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        int current = nums1.length - 1;
        int i = m - 1, j = n - 1;
        for (; i >= 0 && j >= 0; ) {
            if (nums1[i] > nums2[j]) {
                nums1[current--] = nums1[i--];
            } else {
                nums1[current--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[current--] = nums2[j--];
        }
    }
}
