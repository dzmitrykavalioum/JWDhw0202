package com.dzmitrykavalioum.model;

import java.io.Serializable;

//Laptop : BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHS=18
public class Laptop implements Serializable {
    private static int id = 0;
    private int uid;
    private int categoryId = 2;
    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private double displayInches;
    private int price;

    public Laptop() {
        uid = id;
        id++;
    }

    public Laptop(double batteryCapacity, String os,
                  int memoryRom, int systemMemory,
                  double cpu, double displayInches, int price) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
        this.price = price;
        uid = id;
        id++;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getId() {
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
        return "Laptop "+ "\tbattery capacity: "+ batteryCapacity +
        "\tOS: " + os + "\tmemory rom: " + memoryRom +
        "\tsystem memory: " + systemMemory + "\tcpu: "+ cpu +
        "\tdisplay inches: " + displayInches + "\tprice: "+ price;
    }
}
