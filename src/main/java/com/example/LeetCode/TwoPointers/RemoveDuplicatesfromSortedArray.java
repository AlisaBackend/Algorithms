package com.example.LeetCode.TwoPointers;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        // Указатель на позицию для следующего уникального элемента
        int left = 1;
        
        // Указатель для прохода по массиву
        for (int right = 1; right < nums.length; right++) {
            // Если текущий элемент отличается от предыдущего уникального
            if (nums[right] != nums[left - 1]) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
    
