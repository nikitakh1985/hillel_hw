package test;

public class Runner {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Car(1, "bmw", "750i", 2017, "red", 65000, "AX4602HK"),
                new Car(2, "bmw", "318i", 2017, "Blue", 65000, "AX4574TR"),
                new Car(3, "Lexus", "is350", 2005, "gray", 20000, "AX5698HY"),
                new Car(4, "Lexus", "is460", 2015, "red", 65000, "AX0694HY"),
                new Car(5, "Mazda", "6GG", 2006, "white", 6000, "AX5694HY"),
                new Car(6, "Mazda", "3", 2015, "red", 71000, "AX1394HY"),
                new Car(7, "Lexus", "is460", 2015, "black", 80000, "AX5694HY"),
                new Car(8, "Mazda", "6GG", 2003, "red", 6000, "AX8994HY"),
                new Car(9, "Lexus", "is460", 2012, "red", 80000, "AX6294HY"),
                new Car(10, "Audi", "A8", 2020, "yellow", 25000, "AX4579YR")
        };
        CarProcessor carProcessor1 = new CarProcessor();
        System.out.println("Find Cars By Mark: ");
        carProcessor1.findCarsByMark(cars, "Lexus");
        System.out.println("\n" + "Find Cars By Model Which Work More Than Years");
        carProcessor1.findCarsByModelWhichWorkMoreThanYears(cars, "Lexus", 10);
        System.out.println("\n" + "Find Cars By Production Year With More Price:");
        carProcessor1.findCarsByProductionYearWithMorePrice(cars, 2017, 2000);
    }
}

