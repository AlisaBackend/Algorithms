package com.GreedyAldorithms;

import java.util.Arrays;
import java.util.Collections;

public class Task1{
    //задача 1
    // решение (правильное)
    // сложность O(n*logn)
    public static String maxNambers(int[] arr){
        //решение 2 короткое
        return String.join("", Arrays.stream(arr).boxed() // переводим наш массив в поток stream(arr) (поток в термине лямбда выраженния, не ввода вывода и не в многопоточности)
                    .sorted(Collections.reverseOrder())
                    .map(String:: valueOf) //чтобы перевести наши числа в строки
                    .toArray(String[]::new)); // чтобы переместить наш поток в массив
        //решение 1 длинное
        // Arrays.sort(arr);
        // String result = "";

        // for(int i = arr.length - 1; i >= 0; i--){
        // result += arr[i];
        // }
        // return result;
    }
}