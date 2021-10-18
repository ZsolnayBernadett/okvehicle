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

package controllers;

import java.util.ArrayList;
import models.LoadVehicle;
import models.Vehicle;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;
    LoadVehicle loadVehicle;

    public MainController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.loadVehicle = new LoadVehicle();
        initEvent();
 
        ArrayList<Vehicle> vehicleList = this.loadVehicle.load();
            for(Vehicle vehicle : vehicleList) {
            this.mainWindow.vehicleModel.addRow(
                new Object[] {vehicle.ordinal, vehicle.brand, vehicle.year}
            );
        }
    }

    public void initEvent(){
        addBtn();
        saveBtn();
        delBtn();
    }

    public void addBtn(){

        this.mainWindow.addButton.addActionListener(event -> {
            System.out.println("Hozzáadás...");
            String ordinal = this.mainWindow.ordinalField.getText();
            String brand = this.mainWindow.brandField.getText();
            String year = this.mainWindow.yearField.getText();

            this.mainWindow.ordinalField.setText("");
            this.mainWindow.brandField.setText("");
            this.mainWindow.yearField.setText("");
            this.mainWindow.vehicleModel.addRow(
            new Object[] {ordinal, brand, year}
            );
        });
    }
    public void saveBtn(){

        this.mainWindow.saveButton.addActionListener(event -> {
            System.out.println("Mentés...");
            String ordinal = this.mainWindow.ordinalField.getText();
            String brand = this.mainWindow.brandField.getText();
            String year = this.mainWindow.yearField.getText();

            this.mainWindow.ordinalField.setText("");
            this.mainWindow.brandField.setText("");
            this.mainWindow.yearField.setText("");
            this.mainWindow.vehicleModel.addRow(
            new Object[] {ordinal, brand, year}
            );
        });
    }
    public void delBtn(){

        this.mainWindow.delButton.addActionListener(event -> {
            System.out.println("Törlés...");
            String ordinal = this.mainWindow.ordinalField.getText();
            String brand = this.mainWindow.brandField.getText();
            String year = this.mainWindow.yearField.getText();

            this.mainWindow.ordinalField.setText("");
            this.mainWindow.brandField.setText("");
            this.mainWindow.yearField.setText("");
            this.mainWindow.vehicleModel.addRow(
            new Object[] {ordinal, brand, year}
            );
        });
    }
}
