package com.example.Fibonacci;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* Мемоизация - это техника которая 
* позволяет избежать Повторных вычислений 
* в рекурсивной функции/методе
*/

public class Memorisation {

     // наивный, метод поиска числа Фибоначчи
     // применим к нему технику Мемоизации
    
// Публичный метод-обёртка — удобно вызывать снаружи
    public static long fibNaive(int n) {
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        return fibNaive(n, mem);
    }

    // Приватный рекурсивный метод — деталь реализации
    private static long fibNaive(int n, long[] mem) {  //поменяли сигнатуру метода (int n) -> (int n, long[] mem)
        if (mem[n] != -1) {
            return mem[n];
        }
        if (n <= 1) {
            return n;
        }
        long result = fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
        mem[n] = result;
        return result;
    }

    // здесь мы просто берем 2 предыдущих числа и складываем
    // после помещаем эту мумму в наше число и высчитываем следующее
    
    public static long fibEffective(int n){
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