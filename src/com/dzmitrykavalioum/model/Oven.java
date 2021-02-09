package com.dzmitrykavalioum.model;

import java.io.Serializable;

//Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5
public class Oven implements Serializable {
    private static int id = 0;
    private int uid;
    private int powerConsumption;
    private double weight;
    private int capacity;
    private int depth;
    private double height;
    private int width;
    private int price;

    public Oven() {
        uid = id;
        id++;
    }

    public Oven(int powerConsumption, double weight, int capacity, int depth, double height, int width, int price) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.price = price;
        uid = id;
        id++;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getUid() {
        return uid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    //Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5
    @Override
    public String toString() {
        return uid + ". Oven : POWER_CONSUMPTION=" + powerConsumption + ", WEIGHT=" + weight +
                ", CAPACITY=" + capacity + ", DEPTH=" + depth + ", HEIGHT=" + height +
                ", WIDTH=" + width + ", PRICE=" + price;
    }
}
