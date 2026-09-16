package com.GreedyAldorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Task1{

    public static void main(String[] args){
        Random random = new Random();
        int[] arr = new int[10];
        arr[0] = random.nextInt(10);
        arr[1] = random.nextInt(10);
        arr[2] = random.nextInt(10);
        arr[3] = random.nextInt(10);
        arr[4] = random.nextInt(10);
        arr[5] = random.nextInt(10);
        arr[6] = random.nextInt(10);
        arr[7] = random.nextInt(10);
        arr[8] = random.nextInt(10);
        arr[9] = random.nextInt(10);
        //System.out.println(arr[]); //ошибка
        System.out.println(Arrays.toString(arr));
        System.out.println(maxNambers(arr));
    }
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
        Arrays.sort(arr);
        String result = "";

        for(int i = arr.length - 1; i >= 0; i--){
            result += arr[i];
        }
        return result;
    }

    //задача 2

  

}