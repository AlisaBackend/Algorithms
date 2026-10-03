package com.example.LeetCode.TwoPointers;

public class SortColos {
    
    public void sortColors(int[] nums) {
        int n = nums.length;
        int leftPointer = 0;
        int rightPointer = n - 1;
        int mid = 0; //текущий элемент

        while (mid <= rightPointer){
            if (nums[mid] == 0){
                swap(nums, leftPointer, mid);
                leftPointer ++;
                mid ++;
            } else if (nums[mid] == 1) {
                mid++;
            } else{
                //nums[mid] == 2
                swap(nums, rightPointer, mid);
                rightPointer--;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}