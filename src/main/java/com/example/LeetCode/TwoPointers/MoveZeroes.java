package com.example.LeetCode.TwoPointers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MoveZeroes {
    
    public static void moveZeroes(int[] nums) {
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        LinkedHashMap<Integer, Integer> map2 = new LinkedHashMap<>();
        
    }
}