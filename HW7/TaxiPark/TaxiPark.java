package HW7.TaxiPark;

import HW7.Vehicle.*;

public class TaxiPark implements ITaxiPark {
Car[] result;

    public TaxiPark(Car[] result) {
        this.result = result;
    }

    @Override

    public int calculateCost(Car[] cars) {
        int cost = 0;
        for (Car car : cars) {
            cost += car.getPrice();
        }
        return cost;
    }

    @Override
    public void sortByFuelConsumption() {
                Car temp;
        for (int k = 0; k < result.length; k++) {
            for (int l = k + 1; l < (result.length - 1); l++) {
                if (result[k].getFuelConsumption() > result[l].getFuelConsumption()) {
                    temp = result[k];
                    result[k] = result[l];
                    result[l] = temp;
                }
            }
        }

    }

    @Override
    public Car[] findCarsBySpeedRange(Car[] vehicle, int minSpeed, int maxSpeed) {
        Car[] res = new Car[0];
        for (Car car : vehicle) {
            if (car.getSpeed() >= minSpeed && car.getSpeed() <= maxSpeed) {
                res = extendCarsArrayByNewCar(car, res);
            }
        }
        return res;
    }

    public Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] cars) {
        if (cars.length == 0) {
            return new Car[]{carToAdd};
        } else {
            Car[] newCarsArr = new Car[cars.length + 1];
            for (int i = 0; i < cars.length; i++) {
                newCarsArr[i] = cars[i];

            }
            newCarsArr[cars.length] = carToAdd;
            return newCarsArr;
        }
    }


}
