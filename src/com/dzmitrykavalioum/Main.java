package com.dzmitrykavalioum;

import com.dzmitrykavalioum.model.*;

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

        try {
            File file = new File("appliances_db.txt");
            Scanner scanner = new Scanner(file);


        } catch (FileNotFoundException e) {
            System.out.println("File not  found");
        }

        System.out.println("All ok");

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
}
