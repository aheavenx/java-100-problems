package com.aheavenx.leetcodep;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by aheavenx on 22.11.17.
 */
public class TwoSum {

    public static void main(String[] args) {
        Arrays.asList(new TwoSum().twoSum(new int[] {2, 7, 11, 15}, 9)).forEach(System.out::println);
        Arrays.asList(new TwoSum().twoSum(new int[] {3, 2, 4},      7)).forEach(System.out::println);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(10000);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            map.put(i, nums[i]);
        }
        for (int i = 0; i < length; i++) {
            int comp = target - map.get(i);
            if (map.containsValue(comp) && map.get(i) != comp) {
                return new int[] {i, map.get(i)};
            }
        }
        return null;
    }
}
