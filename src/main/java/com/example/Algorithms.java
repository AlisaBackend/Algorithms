package com.example;

import com.example.Fibonacci.Fibonacci;
import com.example.Fibonacci.Memorisation;

public class Algorithms
{
    public static void main( String[] args )
    {

        int n = 40;

        // Вызов метода из класса Fibonacci
        long result1 = Fibonacci.fibEffective(n);
        System.out.println("Fibonacci.fibEffective(" + n + ") = " + result1);

        // Вызов метода из класса Memorisation
        long result2 = Memorisation.fibNaive(n);
        System.out.println("Memorisation.fibNaive(" + n + ") = " + result2);

        long result3 = Memorisation.fibEffective(n);
        System.out.println("Memorisation.fibEffective(" + n + ") = " + result3);
    }
}
