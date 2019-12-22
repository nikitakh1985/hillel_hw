package HW6;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {
                new ElectricCar(1,"FIAT",100000, 170, 10),
                new ElectricCar(2,"VAZ",80000, 180, 10),
                new ElectricCar(3,"MAZDA",700000, 150, 10),
                new Truck(4,"DACIA",100000, 70, 170),
                new Truck(5,"TOYOTA",100000, 110, 160),
                new Bus(6,"AUDI",160000, 45, 110, 50),
                new Bus(7,"BMW",150000, 40, 100, 80),
                new Bus(8,"LEXUS",180000, 47, 130, 200)};

        TaxiPark tp = new TaxiPark(cars);
        System.out.println("\n" + "ALL car fleet data: \n" + tp);
        System.out.println(" Total cost of the fleet: " + tp.calculateCost() +  " "+"USD\n");
        System.out.println("\n Sort fleet by fuel consumption:");
        System.out.println(Arrays.toString(tp.sortByFuelConsumption(10, 45)));

        System.out.println(" \n" + "Sorting a car by speed range: ");
        System.out.println(Arrays.toString(tp.findCarsBySpeedRange(160, 200)));
    }
}