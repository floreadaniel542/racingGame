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
        car.name = "Dacia";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 5;
        car.maxSpeed = 180;
        car.fuelType = "Gasoline";

        System.out.println(car.name) ;
        System.out.println(car.traveleDistance) ;
        System.out.println(car.running) ;

        car.accelerate(60, 1);

        Engine engine2 = new Engine () ;
        engine2.manufactures = "VM";
        engine2.capacity = 1600;

        Car car2 = new Car(engine2) ;
        car2.name = "Golf";
        car.name = "Skoda";
//        car.name = null;

        car.fuelLevel = 90;
        car.mileage = 9.5;
        car.doorCount = 4;
        car.maxSpeed = 220;
        car.fuelType = "Gasoline";

        Engine engine3 = new Engine();
        engine3.manufactures = "Renault";
        engine3.capacity = 1900;

        car.engine = engine3;

        //concatenation
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car1 name: " + car.name);

        car = car2;

        System.out.println("Modulo examples");
        System.out.println(4 % 2);
        System.out.println(4 % 3);

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Input from user: " + text);



    }

}

