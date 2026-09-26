package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import com.GreedyAldorithms.FractionalKnapsackProblem;
import com.GreedyAldorithms.Item;
import com.GreedyAldorithms.Task1;
import com.GreedyAldorithms.Task2;
import com.example.Fibonacci.Fibonacci;
import com.example.Fibonacci.Memorisation;
import com.example.LeetCode.ArraysAndHashing.GroupAnagrams;
import com.example.LeetCode.ArraysAndHashing.TopKFrequentElements;
import com.example.LeetCode.TwoPointers.MoveZeroes;


public class Algorithms
{
    public static void main( String[] args )
    {

        // int n = 8;

        // // Вызов метода из класса Fibonacci
        // long result1 = Fibonacci.fibEffective(n);
        // System.out.println("Fibonacci.fibEffective(" + n + ") = " + result1);

        // // Вызов метода из класса Memorisation
        // long result2 = Memorisation.fibNaive(n);
        // System.out.println("Memorisation.fibNaive(" + n + ") = " + result2);

        // long result3 = Memorisation.fibEffective(n);
        // System.out.println("Memorisation.fibEffective(" + n + ") = " + result3);

        // //Task1
        // Random random = new Random();
        // int[] arr = new int[10];
        // arr[0] = random.nextInt(10);
        // arr[1] = random.nextInt(10);
        // arr[2] = random.nextInt(10);
        // arr[3] = random.nextInt(10);
        // arr[4] = random.nextInt(10);
        // arr[5] = random.nextInt(10);
        // arr[6] = random.nextInt(10);
        // arr[7] = random.nextInt(10);
        // arr[8] = random.nextInt(10);
        // arr[9] = random.nextInt(10);
        // System.out.println(Arrays.toString(arr)); 
        // String strTask1 = Task1.maxNambers(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println("strTask1: " + strTask1);

        // //Task2
        // int[] stations = {0, 200, 375, 500, 750, 950};
        // int task2 = Task2.minStops(stations, 400);
        // System.out.println("task2.minStops: " + task2); //capacity - это сколько машина может проехать до ближайшей заправки

        // //FractionalKnapsackProblem
        // final Item item1 = new Item(4, 20);
        // final Item item2 = new Item(3, 18);
        // final Item item3 = new Item(2, 14);
        // final Item[] items = {item1, item2, item3};
        // // сортировка O(n*logn)
        // Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        // System.out.println(Arrays.toString(items));
        // final int W = 7; //вместимость рюкзака
        // FractionalKnapsackProblem knapsack = new FractionalKnapsackProblem();
        // double greatItem = knapsack.greatElements(items, W);

        // //ValidAnagram
        // String s = "erty";
        // String t = "ryet";
        // boolean sol = ValidAnagram.isAnagram(s, t);
        // System.out.println("isAnagram" + sol);

        // //TopKFrequentElements
        // int[] nums = {1,2,1,2,1,2,3,1,3,2};
        // int k = 2;
        // int[] sol = TopKFrequentElements.topKFrequent(nums, k);
        // System.out.println("TopKFrequentElements " + sol);

        //MoveZeroes
        MoveZeroes move = new MoveZeroes();
        int[] nums1 = {0, 1, 0, 3, 12};
        move.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // [1, 3, 12, 0, 0]
        
        int[] nums2 = {0};
        move.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // [0]
        
        int[] nums3 = {1, 2, 3};
        move.moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3)); // [1, 2, 3]

        

    }
}
