package com.dzmitrykavalioum.model;

import java.io.Serializable;

//TabletPC : BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=2, COLOR=blue
public class TabletPC implements Serializable {
    private static int id = 0;
    private int uid;
    private int categoryId = 6;
    private int batteryCapacity;
    private double displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;
    private int price;

    public TabletPC() {
        uid = id;
        id++;
    }

    public TabletPC(int batteryCapacity, double displayInches, int memoryRom, int flashMemoryCapacity,
                    String color, int price) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
        this.price = price;
        uid = id;
        id++;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @Override
    public String toString() {
        return "Laptop \t battery capacity: "+  batteryCapacity + "\tdisplay inches: " + displayInches +
        "\tmemory rom: " + memoryRom + "\tflash memory capacity: " + flashMemoryCapacity +
        "\tcolor: " + color + "\tprice: " + price;
    }
}
