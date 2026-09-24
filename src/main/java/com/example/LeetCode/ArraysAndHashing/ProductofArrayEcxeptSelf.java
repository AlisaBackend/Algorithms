package com.example.LeetCode.ArraysAndHashing;

public class ProductofArrayEcxeptSelf {

    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
    int[] answer = new int[n];
    
    // перемножаем все элементы слева от i
    answer[0] = 1;
    for (int i = 1; i < n; i++) {
        answer[i] = answer[i - 1] * nums[i - 1]; // взяли предыдущую массу и умножили с следующим числои и поместили на место чтобы число на этом месте было произведенем всей массы 
    }
    
    // перемножаем все элементы справа от i
    int rightProduct = 1; // чтобы существовала 
    for (int i = n - 1; i >= 0; i--) {  // i => 3 2 1 0
        answer[i] = answer[i] * rightProduct; // rightProduct = rightProduct * nums[i+1]
        rightProduct *= nums[i]; // игнорируется первая итерация 
    }
    
    return answer;
    }
}
