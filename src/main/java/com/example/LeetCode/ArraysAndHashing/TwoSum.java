package com.example.LeetCode.ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        // Хранит число -> его индекс
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Если нужное дополнение уже встречалось, возвращаем индексы
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Иначе сохраняем текущее число и его индекс
            map.put(nums[i], i);
        }
        
        // По условию задачи решение всегда существует, поэтому эта строка не выполнится
        return new int[] {};
    }
}