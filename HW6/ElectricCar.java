package HW7;

public class ElectricCar extends Car {
    private int powerReserve;

    public ElectricCar(int id, String mark, int price, int maxSpeed, int powerReserve) {
        super(id, mark, price, maxSpeed);
        this.powerReserve = powerReserve;

    }

    public int getPowerReserve() {
        return powerReserve;
    }

    public void setPowerReserve(int powerReserve) {
        this.powerReserve = powerReserve;
    }

    @Override
    public int getFuelConsumption() {
        return 0;
    }

    @Override
    public String toString() {
        return "ID: " + getid() + " " + getmark() + " " + "ElectricCar [powerReserve=" + powerReserve +
                ", prises=" + getPrice() + ", maxSpeed=" + getMaxSpeed() + "]";

    }
}
