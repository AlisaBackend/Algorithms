package com.example.LeetCode.ArraysAndHashing;

import java.util.*;

public class ContainsDuplicate {
    static int[] nums = new int[]{1,2,3,4,5,6,7,8,9,3};

    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<>();  //unic elements
        for(int num:nums){ //num so iterator, and for nums
            if(!set.add(num)){ // if num alredy present add() return false => !add() return true
                return true;
            }
        }
        return false;    
    }
}
