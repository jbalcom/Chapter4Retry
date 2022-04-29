package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("PP 4.1 - ThermometerTest\n");
        Thermometer temp = new Thermometer();

        System.out.println(temp);
        temp.increaseTemp();
        temp.getTemp();
        System.out.println(temp);

        temp.resetTemp();
        System.out.println(temp);

        System.out.println("\nPP 4.2 - Lights\n");
        LightBulb light1 = new LightBulb();
        LightBulb light2 = new LightBulb();
        LightBulb light3 = new LightBulb();

        System.out.println("Light 1" + light1);
        System.out.println("Light 2" + light2);
        System.out.println("Light 3" + light3);
        light1.turnOnLight();
        System.out.println("Light 1" + light1);
        light2.turnOnLight();
        System.out.println("Light 2" + light2);
        light3.turnOnLight();
        System.out.println("Light 3" + light3);
        light2.turnOffLight();
        System.out.println("Light 2" + light2);

        System.out.println("\nPP 4.3 - MultiCylinder\n");
        Cylinder item1 = new Cylinder(5.0, 3.0);
        Cylinder item2 = new Cylinder(2.5, 5.5);
        Cylinder item3 = new Cylinder(4.0, 8.5);

        System.out.println("Cylinder 1's height is " + item1.getHeight() + " and radius is " + item1.getRadius());
        System.out.println("Cylinder 1's height is " + item2.getHeight() + " and radius is " + item2.getRadius());
        System.out.println("Cylinder 1's height is " + item3.getHeight() + " and radius is " + item3.getRadius());

        System.out.println();

        item1.calcVolume();
        item1.calcSurfaceArea();
        item2.calcVolume();
        item2.calcSurfaceArea();
        item3.calcVolume();
        item3.calcSurfaceArea();

        System.out.println("Cylinder 1: " + item1);
        System.out.println("Cylinder 2: " + item2);
        System.out.println("Cylinder 3: " + item3);

        System.out.println("\nPP 4.4 - Kennel\n");
        Dog dog1 = new Dog("Rookie", 4);
        Dog dog2 = new Dog("Scooby", 7);
        Dog dog3 = new Dog("Archer", 1);

        System.out.println("Dog 1: Hi! I am " + dog1.getDogName() + " and I am " + dog1.getDogYearsAge() + " years old.");
        System.out.println("Dog 2: Hi! I am " + dog2.getDogName() + " and I am " + dog2.getDogYearsAge() + " years old.");
        System.out.println("Dog 3: Hi! I am " + dog3.getDogName() + " and I am " + dog3.getDogYearsAge() + " years old.");

        System.out.println();

        dog1.getPersonAge();
        dog2.getPersonAge();
        dog3.getPersonAge();

        System.out.println(dog1.getDogName() + " " + dog1);
        System.out.println(dog2.getDogName() + " " + dog2);
        System.out.println(dog2.getDogName() + " " + dog3);

        System.out.println("\nPP 4.5- CarTest\n");
        Car car1 = new Car(2002, "Infiniti", "G20");
        Car car2 = new Car(1989, "Nissen", "Maxima");
        Car car3 = new Car(1998, "Honda", "Civic");
        Car car4 = new Car(1958, "Chevy", "Impala");

        System.out.println("Car 1" + car1 + "  It is an antique - " + car1.isAntique());
        System.out.println("Car 2" + car2 + "  It is an antique - " + car2.isAntique());
        System.out.println("Car 3" + car3 + "  It is an antique - " + car3.isAntique());
        System.out.println("Car 4" + car4 + "  It is an antique - " + car4.isAntique());

        System.out.println("\nPP 4.6 - BoxTest\n");
        Box box1 = new Box(3.0, 2.0, 5.0);
        Box box2 = new Box(5.5, 2.5, 3.0);
        Box box3 = new Box(10.5, 8.5, 4.5);

        box1.setFull(false);
        box2.setFull(true);
        box3.setFull(true);
        System.out.println("Box 1" + box1);
        System.out.println("Box 2" + box2);
        System.out.println("Box 3" + box3);

        System.out.println("\nPP 4.7 - Bookshelf\n");
        Book book1 = new Book("The Seventh Tower", "Garth Nix", "Scholastic Paperbacks", 2000);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner's", 1925);
        Book book3 = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling ", "Scholastic Inc.", 1998);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\nPP 4.8 - DurationTest\n");
        Duration time1 = new Duration(3, 25, 15, 40);
        Duration time2 = new Duration(1, 10,12, 50);
        Duration time3 = new Duration(8, 55,36, 44);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        System.out.println();
        System.out.println("Time 1's duration is " + time1.getlength() + " minutes.");
        System.out.println("Time 2's duration is " + time2.getlength() + " minutes.");
        System.out.println("Time 3's duration is " + time3.getlength() + " minutes.");

        System.out.println("\nPP 4.9 - RollingDice2\n");

        PairOfDice diePair = new PairOfDice();
        diePair.rollDice();
        System.out.println(diePair);
    }
}
