package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // this is a one-line comment

        Engine engine = new Engine();
        engine.manufactures = "Renault";
        engine.capacity = 1600;

        Car car = new Car(engine);
        car.setName("Dacia") ;
        car.setFuelLevel(60) ;
        car.setMileage(8.5) ;
        car.doorCount = 5 ;
        car.setMaxSpeed(180) ;
        car.setFuelType("Gasoline") ;

        System.out.println(car.getName());
        System.out.println(car.getTraveleDistance());
        System.out.println(car.running) ;

        car.accelerate(60, 1);

        Engine engine2 = new Engine () ;
        engine2.manufactures = "VM";
        engine2.capacity = 1600;

        Car car2 = new Car(engine2) ;
        car2.setName("Golf");
        car.setName("Skoda");
//        car.name = null;

        car.setFuelLevel(90);
        car.setMileage(9.5);
        car.doorCount = 4;
        car.setMaxSpeed(220);
        car.setFuelType("Gasoline") ;

        Engine engine3 = new Engine();
        engine3.manufactures = "Renault";
        engine3.capacity = 1900;

        car.engine = engine3;

        //concatenation
        System.out.println("Car2 name: " + car2.getName());
        System.out.println("Car1 name: " + car.getName());

        car = car2;

        System.out.println("Modulo examples");
        System.out.println(4 % 2);
        System.out.println(4 % 3);

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Input from user: " + text);

//        System.out.println("Static variables example:");
//
//        //we should only call static variables from the class itself (Car),
//        // not from a variable containing an object of that class
//
//        car.totalCount = 1;
//
//        System.out.println("Total count in car : " + car.totalCount);
//
//        car2.totalCount = 2;
//
//        System.out.println("Total count in car after setting car2: " + car.totalCount);
//        System.out.println("Total count in car2: " + car2.totalCount) ;
//        System.out.println("Total count in Car class: " + Car.totalCount);

    }

}

