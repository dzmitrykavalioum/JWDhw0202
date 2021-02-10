package com.dzmitrykavalioum.utils;

import com.dzmitrykavalioum.model.*;

public class ObjectGenerator {
    public static Object getProductFromString(String line, int categoryId) {
        String[] properties;
        switch (categoryId) {
            case 1:             //kettle
                properties = line.split(", ", 4);
                Kettle kettle = new Kettle(properties[0].split("=")[1],
                        Double.parseDouble(properties[1].split("=")[1]),
                        Double.parseDouble(properties[2].split("=")[1]),
                        Integer.parseInt(properties[3].split("=")[1]));
                return kettle;

            case 2:         //laptop
                //double batteryCapacity, String os,
                //                  int memoryRom, int systemMemory,
                //                  double cpu, double displayInches, int price
                properties = line.split(", ", 7);
                Laptop laptop = new Laptop(Double.parseDouble(properties[0].split("=")[1]),
                        properties[1].split("=")[1],
                        Integer.parseInt(properties[2].split("=")[1]),
                        Integer.parseInt(properties[3].split("=")[1]),
                        Double.parseDouble(properties[4].split("=")[1]),
                        Double.parseDouble(properties[5].split("=")[1]),
                        Integer.parseInt(properties[6].split("=")[1])
                );
                return laptop;
            case 3:             //oven int powerConsumption, double weight, double capacity, double depth, double height, double width, int price
                properties = line.split(", ", 7);
                Oven oven = new Oven(Integer.parseInt(properties[0].split("=")[1]),
                        Double.parseDouble(properties[1].split("=")[1]),
                        Double.parseDouble(properties[2].split("=")[1]),
                        Double.parseDouble(properties[3].split("=")[1]),
                        Double.parseDouble(properties[4].split("=")[1]),
                        Double.parseDouble(properties[5].split("=")[1]),
                        Integer.parseInt(properties[0].split("=")[1]));
                return oven;
            case 4:             //refrigerator
                properties = line.split(", ", 7);
                Refrigerator refrigerator = new Refrigerator(Integer.parseInt(properties[0].split("=")[1]),
                        Double.parseDouble(properties[1].split("=")[1]),
                        Double.parseDouble(properties[2].split("=")[1]),
                        Double.parseDouble(properties[3].split("=")[1]),
                        Double.parseDouble(properties[4].split("=")[1]),
                        Double.parseDouble(properties[5].split("=")[1]),
                        Integer.parseInt(properties[0].split("=")[1]));
                return refrigerator;
            case 5:             //speakers
                properties = line.split(", ", 5);
                Speakers speakers = new Speakers(Integer.parseInt(properties[0].split("=")[1]),
                        Integer.parseInt(properties[1].split("=")[1]),
                        properties[2].split("=")[1],
                        Integer.parseInt(properties[3].split("=")[1]),
                        Integer.parseInt(properties[4].split("=")[1])
                );
                return speakers;

            case 6:             //tabletPC
                properties = line.split(", ", 6);
                TabletPC tabletPC = new TabletPC(
                        Integer.parseInt(properties[0].split("=")[1]),
                        Double.parseDouble(properties[1].split("=")[1]),
                        Integer.parseInt(properties[2].split("=")[1]),
                        Integer.parseInt(properties[3].split("=")[1]),
                        properties[4].split("=")[1],
                        Integer.parseInt(properties[5].split("=")[1]));
                return tabletPC;

            case 7:             //vacuum cleaner
                properties = line.split(", ", 7);
                VacuumCleaner vacuumCleaner = new VacuumCleaner(
                        Integer.parseInt(properties[0].split("=")[1]),
                        properties[1].split("=")[1],
                        properties[2].split("=")[1],
                        properties[3].split("=")[1],
                        Integer.parseInt(properties[4].split("=")[1]),
                        Integer.parseInt(properties[5].split("=")[1]),
                        Integer.parseInt(properties[6].split("=")[1])
                );
                return vacuumCleaner;
        }
        return null;

    }
}
