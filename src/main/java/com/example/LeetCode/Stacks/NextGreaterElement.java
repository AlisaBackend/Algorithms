package com.example.LeetCode.Stacks;

import java.util.*;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 1. Строим карту: элемент -> его следующий больший справа
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>(); // монотонный стек

        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            // Убираем всё, что меньше или равно текущему — они не могут быть "следующим большим"
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            // Если стек не пуст — вершина и есть следующий больший
            nextGreater.put(num, stack.isEmpty() ? -1 : stack.peek());

            // Текущий элемент становится кандидатом для элементов слева
            stack.push(num);
        }

        // 2. Заполняем ответ для nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.get(nums1[i]);
        }

        return result;
    }
}