package com.example.LeetCode.Stacks;

import java.util.*;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // nextGreater[x] = первый элемент справа от x в nums2, который больше x
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>(); // монотонно убывающий стек

        for (int x : nums2) {
            while (!stack.isEmpty() && stack.peek() < x) {
                nextGreater.put(stack.pop(), x);
            }
            stack.push(x);
        }
        // элементы, оставшиеся в стеке, не имеют большего справа -> -1
        while (!stack.isEmpty()) {
            nextGreater.put(stack.pop(), -1);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater.get(nums1[i]);
        }
        return ans;
    }
}