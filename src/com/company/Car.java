package com.company;

public class Car {
    private int carYear;
    private String carMake;
    private String carModel;

    public Car(int carYear, String carMake, String carModel) {
        this.carYear = carYear;
        this.carMake = carMake;
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public boolean isAntique(){
        if (2022 - carYear >= 45){
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return " is a " + carYear + " " + carMake + " " + carModel + ".";
    }
}
