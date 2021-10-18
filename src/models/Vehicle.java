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

public class Vehicle {

    public String ordinal;
    public String brand;
    public String year;    

    public String getOrdinal() {
        return ordinal;
    }
    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

}
