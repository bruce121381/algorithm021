package com.geektime.week01.everyday.no169_1;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.everyday.no169_1
 * Description:
 *
 * @date:2020/12/1 11:14
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        Map.Entry<Integer, Integer> major = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (major == null || entry.getValue() >= major.getValue()) {
                major = entry;
            }
        }
        return major.getKey();
    }

}
