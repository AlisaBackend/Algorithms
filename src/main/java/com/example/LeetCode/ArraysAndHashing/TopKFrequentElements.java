package com.example.LeetCode.ArraysAndHashing;

import java.util.*;

public class TopKFrequentElements {

//k = сколько самых частых элементов вернуть, а не порог частоты.

    public int[] topKFrequent(int[] nums, int k) {
    // 1. Считаем частоты
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // 2. Сортируем ключи по частоте (по убыванию)
    List<Integer> keys = new ArrayList<>(map.keySet());
    keys.sort((a, b) -> map.get(b) - map.get(a));

    // 3. Берём первые k
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = keys.get(i);
    }
    return result;
    }
}
