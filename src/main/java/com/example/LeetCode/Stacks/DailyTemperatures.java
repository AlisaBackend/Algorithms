package com.example.LeetCode.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n]; // по умолчанию 0
        Deque<Integer> stack = new ArrayDeque<>(); // хранит индексы

        for (int i = 0; i < n; i++) {
            // пока текущая температура выше, чем у вершины стека —
            // для вершины найден тёплый день
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        // оставшиеся в стеке — тёплого дня впереди нет, answer = 0
        return answer;
    }
}