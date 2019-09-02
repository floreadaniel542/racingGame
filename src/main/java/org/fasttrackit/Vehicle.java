package org.fasttrackit;

public class Vehicle {

    String name;
    double mileage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    double traveleDistance;

    boolean running;

    public double accelerate(double speed, double durationInHours){
        System.out.println(name + " is accelerating with " + speed + "km/h for " + durationInHours + " h.");

        double distance = speed * durationInHours;

        System.out.println("Distance: " + distance);

        traveleDistance = traveleDistance + distance;

        // same result as the above statement
//        traveleDistance += distance;

       double usedFuel = distance * mileage / 100;

        System.out.println("Used fuel: " + usedFuel);

        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }


}
