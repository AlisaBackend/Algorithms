package com.GreedyAldorithms;

public class Task2{

    public static void main(String[] args){
        int[] stations = {0, 200, 375, 500, 750, 950};
        System.out.println(minStops(stations, 400)); //capacity - это сколько машина может проехать до ближайшей заправки
    }
    //задача 2
    public static int minStops(int[] stations, int capacity){

        int result = 0; //оптимальное количество остановок
        int currentStop = 0;
        while(currentStop < stations.length -1){
            // высчитаываем такую заправку котрая дальше всех но не дальше capacity
            int nextStop = currentStop;
            while (nextStop<stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= capacity) {
                    nextStop++;
            }
            if (currentStop == nextStop){
                return -1;
            }
            if(nextStop < stations.length - 1){
                result++;
            }
            currentStop = nextStop;
        }
        return result;
        }
}