package com.example.LeetCode.Stacks;


import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
    private final Deque<Integer> stack = new ArrayDeque<>();
    private final Deque<Integer> minStack = new ArrayDeque<>();

    public MinStack() { }

    public void push(int value) {
        stack.push(value);
        // если minStack пуст или новый элемент <= текущего минимума — обновляем минимум
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        } else {
            minStack.push(minStack.peek()); // дублируем текущий минимум
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}