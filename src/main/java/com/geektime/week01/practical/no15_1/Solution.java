package com.geektime.week01.practical.no15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.practical.no15_1
 * Description:
 *
 * @date:2020/11/30 12:23
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> retList = new ArrayList<>();
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int lastIndex = nums.length - 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                while (j < lastIndex && nums[j] + nums[lastIndex] > target) {
                    lastIndex--;
                }
                if (j == lastIndex) {
                    break;
                }
                if (nums[j] + nums[lastIndex] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[lastIndex]);
                    retList.add(list);
                }
            }
        }
        return retList;
    }

    public void quickSort(int nums[], int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivotIndex = partition(nums, startIndex, endIndex);
        quickSort(nums, startIndex, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, endIndex);
    }

    private int partition(int[] nums, int startIndex, int endIndex) {
        int pivot = nums[startIndex], left = startIndex, right = endIndex;
        while (left != right) {
            while (left < right && nums[right] > pivot) {
                right--;
            }
            while (left < right && nums[left] <= pivot) {
                left++;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        nums[startIndex] = nums[left];
        nums[left] = pivot;
        return left;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{6,5,4,3,2};
        new Solution().quickSort(nums,0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

}
