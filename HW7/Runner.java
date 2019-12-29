package HW7;

import HW7.TaxiPark.TaxiPark;
import HW7.Vehicle.*;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {
                new ElectricCar(1, "FIAT", 56, 5666666, 100, 90),
                new ElectricCar(2, "VAZ", 80, 180000, 150, 60),
                new ElectricCar(3, "MAZDA", 70, 100050, 10, 23),
                new Truck(4, "DACIA", 10, 70000, 170, 89, 2000),
                new Truck(5, "TOYOTA", 10, 100010, 160, 50, 20000),
                new Bus(6, "AUDI", 10, 40005, 110, 50, 80),
                new Bus(7, "BMW", 90, 40000, 100, 80, 76),
                new Bus(8, "LEXUS", 80, 40007, 130, 200, 78)};

        TaxiPark tp = new TaxiPark(cars);
        System.out.println(" 1. Total cost of the fleet: " + tp.calculateCost(cars) + " " + "USD");
        System.out.println("\n 2. Sort fleet by fuel consumption:");
        tp.sortByFuelConsumption();
        for (Car p : cars) {
            System.out.println(p.toString());
        }
        System.out.println(" \n" + " 3. Sorting a car by speed range: ");
        System.out.println(Arrays.toString(tp.findCarsBySpeedRange(cars, 170, 200)));
    }
}