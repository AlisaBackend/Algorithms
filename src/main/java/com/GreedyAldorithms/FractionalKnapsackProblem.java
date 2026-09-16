package com.GreedyAldorithms;

import java.util.*;

public class FractionalKnapsackProblem {

    //реализуем агоритм
    public double greatElements(Item[] items, int W){
        int weightSoFar = 0; //акумулируем текущий вес
        double valueSoFar = 0;//ценность которую мы уже набрали
        int currentItem = 0;//здесь будет храниться индекс текущего объекта

        while(currentItem < items.length && weightSoFar != W){ // пока в рюкзаке есть место
            if(weightSoFar + items[currentItem].getWeight() < W){
                 //берем объект целеком
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();

            } else{
                //берем часть
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getValue()) * items[currentItem].getValue();
                weightSoFar = W; //полный рюкзак
            }
            currentItem++;
        }
        System.out.println("Ценность наилучшего набора: ");
        return valueSoFar;
}