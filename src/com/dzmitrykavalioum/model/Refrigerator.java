package com.dzmitrykavalioum.model;

import java.io.Serializable;

//POWER_CONSUMPTION=100, WEIGHT=20, FREEZER_CAPACITY=10, OVERALL_CAPACITY=300, HEIGHT=200, WIDTH=70
public class Refrigerator implements Serializable {
    private static int id = 0;
    private int uid;
    private int categoryId = 4;
    private int powerConsumption;
    private double weight;
    private double height;
    private double width;
    private double freezerCapacity;
    private double overallCapacity;
    private int price;

    public Refrigerator() {
        uid = id;
        id++;
    }

    public Refrigerator(int powerConsumption,
                        double weight, double freezerCapacity,
                        double overallCapacity, double height, double width, int price) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
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

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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

    @Override
    public String toString() {
        return "Refrigerator \tpower consuption: " + powerConsumption +
        "\tweight: " + weight + "\tfreezer capacity: " + freezerCapacity+
        "\toverall capacity: " + overallCapacity + "\theight: " + height +
        "\twidth: " + width + "\tprice: " + price;
    }
}
