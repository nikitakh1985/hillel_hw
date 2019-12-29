package HW7.TaxiPark;
import HW7.Vehicle.Car;

public interface ITaxiPark {
    int calculateCost(Car[] cars);
    void sortByFuelConsumption();
    Car[] findCarsBySpeedRange(Car[] vehicle, int minSpeed, int maxSpeed);
    Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] cars);
}
