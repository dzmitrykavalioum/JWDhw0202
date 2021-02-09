package com.dzmitrykavalioum.model;

import java.io.Serializable;

public class Kettle implements Serializable {
    private static int id = 0;
    private int uid;
    private String producer;
    private int power;
    private int capacity;
    private int price;

    public Kettle() {
        uid = id;
        id++;
    }

    public Kettle(String producer, int power, int capacity, int price) {

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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Kettle " + producer + "\tpower: " + power + "\tcapacity: " + capacity
                + "\tprice: " + price;
    }
}
