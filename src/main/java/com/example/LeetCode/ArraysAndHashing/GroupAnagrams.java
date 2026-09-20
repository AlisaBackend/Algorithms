package com.example.LeetCode.ArraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    //Вход: strs = ["eat","tea","tan","ate","nat","bat"]
    //Выход: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. Сортируем символы — получаем "подпись" анаграммы
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // 2. Кладём строку в группу по ключу
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            // или без лямбды:
            // map.putIfAbsent(key, new ArrayList<>());
            // map.get(key).add(s);
        }

        // 3. Все группы — в результат
        return new ArrayList<>(map.values());
    }
}