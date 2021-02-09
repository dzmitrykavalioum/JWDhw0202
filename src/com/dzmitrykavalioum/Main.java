package com.dzmitrykavalioum;

import com.dzmitrykavalioum.model.Oven;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Oven oven = new Oven(100, 3, 33, 32, 33, 3, 43);
        Oven oven1 = new Oven(100, 3, 33, 32, 33, 3, 45);
        Oven oven2 = new Oven(100, 3, 33, 32, 33, 3, 34);
        Oven oven3 = new Oven(100, 3, 33, 32, 33, 3, 45);
//        System.out.println(oven);
//        System.out.println(oven1);
//        System.out.println(oven2);
//        System.out.println(oven3);

        
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("appliances_db.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(oven1);
            objectOutputStream.writeObject(oven1);
            objectOutputStream.writeObject(oven2);
            objectOutputStream.writeObject(oven3);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
        System.out.println("All ok");

    }
}
