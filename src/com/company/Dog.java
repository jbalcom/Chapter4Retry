package com.company;

public class Dog {
    private String dogName;
    private int dogYearsAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogYearsAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getDogYearsAge() {
        return dogYearsAge;
    }

    public void setDogYearsAge(int dogYearsAge) {
        this.dogYearsAge = dogYearsAge;
    }

    public int getPersonAge(){
        return dogYearsAge * 7;
    }

    public String toString() {
        return "is " + this.getPersonAge() + " in person years.";
    }
}
