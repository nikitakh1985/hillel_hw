package test;
public class CarProcessor {
    private Car[] array;
    public CarProcessor(Car[] array) {
        this.array = array;
    }

    public CarProcessor() {
        array = new Car[]{};
    }

    private boolean isEmpty() {
        return array.length == 0;
    }

    public void findCarsByMark(Car[] cars, String mark) {
        if (!isEmpty()) {
            for (Car car : cars) {
                if (car.mark.equals(mark)) {
                    printCar(car);
                }
            }
        } else {
            System.out.println("Array is empty!");
        }
    }

    public void findCarsByModelWhichWorkMoreThanYears(Car[] cars, String brand, int yearOfOrigin) {
        if (!isEmpty()) {
            for (Car car : cars) {
                if (car.mark.equals(brand) && car.workingYears() > yearOfOrigin) {
                    printCar(car);
                }
            }
        } else {
            System.out.println("Array is empty!");
        }
    }

    public void findCarsByProductionYearWithMorePrice(Car[] cars, int yearOfOrigin, int price) {
        if (!isEmpty()) {
        for (Car car : cars) {
            if (car.yearOfOrigin == yearOfOrigin && car.price >= price) {
                printCar(car);
            }
        }
    } else

    {
        System.out.println("Array is empty!");
    }
        }

    void printCar(Car car) {
        System.out.println("CARS:" + " " + car.id + " " + car.mark +
                " " + car.model + " " + car.yearOfOrigin + " " + car.color +
                " " + car.price + " " + car.regMark);
    }
}

