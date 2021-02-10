package com.dzmitrykavalioum.model;

import java.io.Serializable;

public class Kettle implements Serializable {
    private static int id = 0;
    private int uid;
    private int categoryId = 1;
    private String producer;
    private double power;
    private double capacity;
    private int price;

    public Kettle() {
        uid = id;
        id++;
    }

    public Kettle(String producer, double power, double capacity, int price) {

        this.producer = producer;
        this.power = power;
        this.capacity = capacity;
        this.price = price;
        uid = id;
        id++;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUid() {
        return uid;
    }

    public int getCategoryId() {
        return categoryId;
    }

    @Override
    public String toString() {
        return "Kettle " + producer + "\tpower: " + power + "\tcapacity: " + capacity
                + "\tprice: " + price;
    }
}
