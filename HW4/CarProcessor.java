
public class CarProcessor {
    public void findCarsByMark(Car[] cars, String mark) {

        for (Car car : cars) {
            if (car.mark.equals(mark)) {
                printCar(car);
            }
        }
    }

    public void findCarsByModelWhichWorkMoreThanYears(Car[] cars, String brand, int yearOfOrigin) {
        for (Car car : cars) {
            if (car.mark.equals(brand) && car.workingYears() > yearOfOrigin) {
                printCar(car);
            }
        }
    }

    public void findCarsByProductionYearWithMorePrice(Car[] cars, int yearOfOrigin, int price) {
        for (Car car : cars) {
            if (car.yearOfOrigin == yearOfOrigin && car.price > price) {
                printCar(car);
            }
        }
    }

    void printCar(Car car) {
        System.out.println("CARS:" + " " + car.id + " " + car.mark + " " + car.model + " " + car.yearOfOrigin + " " + car.color + " " + car.price + " " + car.regMark);
    }
}

