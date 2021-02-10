package com.dzmitrykavalioum;

import com.dzmitrykavalioum.model.*;
import com.dzmitrykavalioum.utils.ObjectGenerator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Kettle> kettles;
    private static List<Laptop> laptops;
    private static List<Oven> ovens;
    private static List<Refrigerator> refrigerators;
    private static List<Speakers> speakers;
    private static List<TabletPC> tablets;
    private static List<VacuumCleaner> vacuumCleaners;

    public static void main(String[] args) {
        initLists();
        String nextLine;


        try {
            File file = new File("appliances_db.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                nextLine = scanner.nextLine();
                if ("\n".equals(nextLine) || "".equals(nextLine)) {
                    continue;
                }
                String[] nameAndProperties = nextLine.split(":", 2);
                addNextLineToModelList(nextLine, nameAndProperties);


            }


        } catch (FileNotFoundException e) {
            System.out.println("File not  found");
        }


        showAllKettles();
        System.out.println(getCheapestProduct());


    }

    private static void initLists() {
        kettles = new ArrayList<Kettle>();
        laptops = new ArrayList<Laptop>();
        ovens = new ArrayList<Oven>();
        refrigerators = new ArrayList<Refrigerator>();
        speakers = new ArrayList<Speakers>();
        tablets = new ArrayList<TabletPC>();
        vacuumCleaners = new ArrayList<VacuumCleaner>();

    }

    private static void addNextLineToModelList(String nextLine, String[] nameAndProperties) {
        String nameModel = nameAndProperties[0].strip();
        String properties = nameAndProperties[1].strip();
        switch (nameModel) {
            case "Kettle":
                kettles.add((Kettle) ObjectGenerator.getProductFromString(properties, 1));
                break;
            case "Laptop":
                laptops.add((Laptop) ObjectGenerator.getProductFromString(properties, 2));
                break;
            case "Oven":
                ovens.add((Oven) ObjectGenerator.getProductFromString(properties, 3));
                break;
            case "Refrigerator":
                refrigerators.add((Refrigerator) ObjectGenerator.getProductFromString(properties, 4));
                break;
            case "Speakers":
                speakers.add((Speakers) ObjectGenerator.getProductFromString(properties, 5));
                break;
            case "TabletPC":
                tablets.add((TabletPC) ObjectGenerator.getProductFromString(properties, 6));
                break;
            case "VacuumCleaner":
                vacuumCleaners.add((VacuumCleaner) ObjectGenerator.getProductFromString(properties, 7));
                break;

        }
    }

    private static void showAllKettles() {
        for (Kettle item : kettles
        ) {
            System.out.println(item);
        }
    }

    public static void showAllInformation() {
        for (Kettle item : kettles
        ) {
            System.out.println(item);
        }
        for (Laptop item : laptops
        ) {
            System.out.println(item);
        }
        for (Oven item : ovens
        ) {
            System.out.println(item);
        }

        for (Refrigerator item : refrigerators
        ) {
            System.out.println(item);
        }

        for (Speakers item : speakers
        ) {
            System.out.println(item);
        }
        for (TabletPC item : tablets) {
            System.out.println(item);
        }

        for (VacuumCleaner item : vacuumCleaners) {
            System.out.println(item);
        }
    }

    public static void showAllQty() {
        System.out.println(kettles.size() + " Kettles");
        System.out.println(laptops.size() + " Laptops");
        System.out.println(ovens.size() + " Ovens");
        System.out.println(refrigerators.size() + " Refrigerators");
        System.out.println(speakers.size() + " Speakers");
        System.out.println(tablets.size() + " Tablets");
        System.out.println(vacuumCleaners.size() + " Vacuum Cleaners");
    }

    public static Object getCheapestProduct() {
        int categoryMin = ObjectGenerator.categoryMin;
        switch (categoryMin) {
            case 1:
                return kettles.get(ObjectGenerator.uidMin);
            case 2:
                return laptops.get(ObjectGenerator.uidMin);
            case 3:
                return ovens.get(ObjectGenerator.uidMin);
            case 4:
                return refrigerators.get(ObjectGenerator.uidMin);
            case 5:
                return speakers.get(ObjectGenerator.uidMin);
            case 6:
                return tablets.get(ObjectGenerator.uidMin);
            case 7:
                return vacuumCleaners.get(ObjectGenerator.uidMin);
        }
        return null;
    }
}
