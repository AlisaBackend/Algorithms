package com.example.Fibonacci;

public class Fibonacci{

    //наивный, метод поиска числа Фибоначчи
    //для 100 будет высчитываться в среднем 50 000 лет
    // реализованно рекурентной функцией 
    private static long fibNaive(int n) {
        if(n <= 1){
            return n;
        }
        return fibNaive(n-1) + fibNaive(n-2);
    }

    //здесь мы просто берем 2 предыдущих числа и складывае
    //после помещаем эту мумму в наше число и высчитываем следующее

    public static long fibEffective(int n) {

        //создадим массив для высчитанных чисел
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i - 2];
        }
        return arr[n];
    }
}