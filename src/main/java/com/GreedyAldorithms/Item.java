package com.GreedyAldorithms;

public class Item {
    private int weight;
    private int value;

    public Item(){
    }
    public Item(int weight, int value){
    this.weight = weight;
        this.value = value;
    }
    public double valuePerUnitOfWeight() {
    return value / (double) weight;
    }
    public int getWeight() {
        return weight;
    }
    public int getValue() {
        return value;
    }
    public String toString() {
        return "{w:" + weight + ",v:" + value + "}";
    }
}