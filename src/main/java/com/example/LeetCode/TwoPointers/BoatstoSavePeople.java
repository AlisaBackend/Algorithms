package com.example.LeetCode.TwoPointers;

public class BoatstoSavePeople {
    
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);              // сортируем по весу
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            // пробуем посадить самого лёгкого вместе с самым тяжёлым
            if (people[left] + people[right] <= limit) {
                left++;   // лёгкий тоже сел в лодку
            }
            right--;      // тяжёлый всегда уезжает
            boats++;      // использовали одну лодку
        }
        return boats;
    }
}