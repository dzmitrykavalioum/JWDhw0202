package com.dzmitrykavalioum.utils;

import com.dzmitrykavalioum.model.Kettle;
import com.dzmitrykavalioum.model.Laptop;

public class ObjectGenerator {
    public static Object getProductFromString(String line, int categoryId) {
        String [] properties;
        switch (categoryId) {
            case 1:
                properties = line.split(", ",4);
                Kettle kettle = new Kettle(properties[0].split("=")[1],
                        Double.parseDouble(properties[1].split("=")[1]),
                        Double.parseDouble(properties[2].split("=")[1]),
                        Integer.parseInt(properties[3].split("=")[1]));
                return kettle;

            case 2:
                //double batteryCapacity, String os,
                //                  int memoryRom, int systemMemory,
                //                  double cpu, double displayInches, int price
                properties = line.split(", ",7);
                Laptop laptop = new Laptop(Double.parseDouble(properties[0].split("=")[1]),
                        properties[1].split("=")[1],
                        Integer.parseInt(properties[2].split("=")[1]),
                        Integer.parseInt(properties[3].split("=")[1]),
                        Double.parseDouble(properties[4].split("=")[1]),
                        Double.parseDouble(properties[5].split("=")[1]),
                        Integer.parseInt(properties[6].split("=")[1])
                        );
                return laptop;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return null;

    }
}
