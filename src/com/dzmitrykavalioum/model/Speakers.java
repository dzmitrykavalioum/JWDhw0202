package com.dzmitrykavalioum.model;

import java.io.Serializable;

//Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2
public class Speakers implements Serializable {
    private static int id = 0;
    private int uid;
    private int categoryId = 5;
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;
    private int price;

    public Speakers() {
        uid = id;
        id++;
    }

    public Speakers(int powerConsumption, int numberOfSpeakers,
                    String frequencyRange, int cordLength, int price) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
        this.price = price;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
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
        return "Speakers \t power consuption: " + powerConsumption + "\tnumber of speakers: " + numberOfSpeakers +
                "\tfrequenct range: " + frequencyRange + "\tcord length" + cordLength + "\tprice: " + price;
    }
}
