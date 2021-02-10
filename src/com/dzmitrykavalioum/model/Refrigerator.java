package com.dzmitrykavalioum.model;

import java.io.Serializable;

//POWER_CONSUMPTION=100, WEIGHT=20, FREEZER_CAPACITY=10, OVERALL_CAPACITY=300, HEIGHT=200, WIDTH=70
public class Refrigerator implements Serializable {
    private static int id = 0;
    private int uid;
    private int categoryId = 4;
    private int powerConsumption;
    private int weight;
    private int height;
    private int width;
    private int freezerCapacity;
    private int overallCapacity;
    private int price;

    public Refrigerator() {
        uid = id;
        id++;
    }

    public Refrigerator(int powerConsumption,
                        int weight, int freezerCapacity,
                        int overallCapacity, int height, int width, int price) {
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


    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getUid() {
        return uid;
    }

    @Override
    public String toString() {
        return "Refrigerator \tpower consuption: " + powerConsumption +
        "\tweight: " + weight + "\tfreezer capacity: " + freezerCapacity+
        "\toverall capacity: " + overallCapacity + "\theight: " + height +
        "\twidth: " + width + "\tprice: " + price;
    }
}
