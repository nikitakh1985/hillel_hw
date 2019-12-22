package HW6;

public class Truck extends Car {
    private int loagCapacity;

    public Truck(int id, String mark, int price, int maxSpeed, int powerReserve) {
        super(id, mark, price, maxSpeed);
        this.loagCapacity = powerReserve;
    }

    public int getLoagCapacity() {
        return loagCapacity;
    }

    public void setLoagCapacity(int loagCapacity) {
        this.loagCapacity = loagCapacity;
    }

    @Override
    public String toString() {
        return "ID: " + getid() + " " + getmark() + "Truck [loagCapacity=" + loagCapacity + ", price=" + getPrice() +
                ", fuelConsumption=" + getFuelConsumption() + ", maxSpeed=" + getMaxSpeed() + "]";
    }
}