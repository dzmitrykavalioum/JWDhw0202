package com.dzmitrykavalioum.model;

import java.io.Serializable;

public class VacuumCleaner implements Serializable {
    //VacuumCleaner : POWER_CONSUMPTION=100, FILTER_TYPE=A, BAG_TYPE=A2, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=3000, CLEANING_WIDTH=20
    private static int id = 0;
    private int uid;
    private int categoryId = 7;
    private int powerConsumption = 100;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;
    private int price;

    public VacuumCleaner() {
        uid = id;
        id++;
    }

    public VacuumCleaner(int powerConsumption, String filterType,
                         String bagType, String wandType,
                         int motorSpeedRegulation, int cleaningWidth, int price) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
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

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Vacuum cleaner \t power consumption: " + powerConsumption + "\tfilter type: " + filterType +
                "\tbag type: " + bagType + "\twand type: " + wandType + "\tmotor speed regulation: " +
                motorSpeedRegulation + "\tcleaning width: " + cleaningWidth + "\t price- " + price;
    }
}
