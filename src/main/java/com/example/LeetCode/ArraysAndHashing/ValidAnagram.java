package com.example.LeetCode.ArraysAndHashing;
import java.util.*;
public class ValidAnagram {
    
    // String s = "erty";
    // String t = "ryet";

    public static boolean isAnagram(String s, String t) {
        char[] sstr = s.toCharArray();
        char[] tstr = t.toCharArray();

        System.out.println(sstr);
        System.out.println(tstr);

        Arrays.sort(sstr);
        Arrays.sort(tstr);

        System.out.println(sstr);
        System.out.println(tstr);

        if(Arrays.equals(sstr, tstr)){
            return true;
        }else{
            return false;
        }
    }
}
