package com.geektime.week01.homework.no1_1;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.homework.no1_1
 * Description:
 *
 * @date:2020/11/30 19:34
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}
