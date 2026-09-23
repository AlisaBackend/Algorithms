package com.example.LeetCode.ArraysAndHashing;

import  java.util.*;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        
        for (int num : nums) {
            // увеличиваем счётчик для текущего элемента
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            
            // Можно сразу проверить — если уже больше n/2, возвращаем
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }
}
