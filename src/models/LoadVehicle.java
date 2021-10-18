/*
 * File: MainController.java
 * Created Date: 2021-09-24 22:21:42
 * Author: Zsolnai Bernadett
 * Github: https://github.com/ZsolnayBernadett
 * -----
 * Last Modified: 2021-10-18
 * Modified By: Zsolnai Bernadett
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 */

package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadVehicle {
    ArrayList<String> vehicles;
    public LoadVehicle() {
        vehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> load(){

    ArrayList<Vehicle> vehicleList = new ArrayList<>();
       
        try {
            FileReader fileReader = new FileReader("data.txt");
            Scanner scanner = new Scanner(fileReader);

            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] lineArray = line.split(":");
                Vehicle vehicle = new Vehicle();
                vehicle.ordinal = lineArray[0];
                vehicle.brand = lineArray[1];
                vehicle.year = lineArray[2];
                vehicleList.add(vehicle);
            }
            
            scanner.close();

        } catch (FileNotFoundException e) {
    
            System.err.println("Hiba! A fájl nem található");
            }   

    return vehicleList;
    }
}
