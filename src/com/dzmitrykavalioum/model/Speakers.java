package com.dzmitrykavalioum.model;

import java.io.Serializable;

//Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2
public class Speakers implements Serializable {
    private static int id = 0;
    private int powerConsumption;
    private int numberOfSpeakers;
    private int frequencyMin;
    private int frequencyMax;
    private int cordLength;

    public Speakers() {
        id++;
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, int frequencyMin, int frequencyMax, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyMin = frequencyMin;
        this.frequencyMax = frequencyMax;
        this.cordLength = cordLength;
        id++;
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

    public int getFrequencyMin() {
        return frequencyMin;
    }

    public void setFrequencyMin(int frequencyMin) {
        this.frequencyMin = frequencyMin;
    }

    public int getFrequencyMax() {
        return frequencyMax;
    }

    public void setFrequencyMax(int frequencyMax) {
        this.frequencyMax = frequencyMax;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    public static int getId() {
        return id;
    }
}
