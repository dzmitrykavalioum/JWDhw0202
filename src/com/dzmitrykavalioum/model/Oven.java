package com.dzmitrykavalioum.model;

import java.io.Serializable;

//Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5
public class Oven implements Serializable {
    private static int id = 0;
    private int uid;
    private int categoryId = 3;
    private int powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;
    private int price;

    public Oven() {
        uid = id;
        id++;
    }

    public Oven(int powerConsumption, double weight, double capacity, double depth, double height, double width, int price) {
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
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
