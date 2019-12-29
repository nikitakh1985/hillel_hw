package HW7.Vehicle;

public class Truck implements Car {
    private int id;
    private String mark;
    private int fuelConsumption;
    private int price;
    private int speed;
    private int currentFuel;
    private int carWeight;

    public Truck(int id, String mark, int fuelConsumption, int price, int speed, int currentFuel, int carWeight) {
        this.id = id;
        this.mark = mark;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.speed = speed;
        this.currentFuel = currentFuel;
        this.carWeight = carWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", speed=" + speed +
                ", currentFuel=" + currentFuel +
                ", carWeight=" + carWeight +
                '}';
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}