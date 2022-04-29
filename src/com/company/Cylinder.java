package com.company;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calcVolume(){
        return Math.PI * Math.pow(radius,2) * height;
    }

    public double calcSurfaceArea(){
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius,2));
    }

    public String toString() {
        return "This cylinder's volume is " + this.calcVolume() + " and the surface area is " + this.calcSurfaceArea() + ".";
    }
}
