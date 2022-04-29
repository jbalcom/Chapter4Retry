package com.company;

public class Thermometer {
    private double currTemp;

    public Thermometer(){
        this.currTemp = 37.0;
    }

    public void increaseTemp(){
        currTemp = currTemp + .01;
    }

    public double getTemp(){
        return currTemp;
    }

    public String toString() {
        return "The current temperature is " + currTemp;
    }

    public void resetTemp(){
        currTemp = 37.0;
    }
}
