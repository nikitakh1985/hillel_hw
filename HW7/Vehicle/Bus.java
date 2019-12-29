package HW7.Vehicle;

public class Bus implements Car {
    private int id;
    private String mark;
    private int fuelConsumption;
    private int price;
    private int speed;
    private int numberOfSeats;
    private int currentFuel;

    public Bus(int id, String mark, int fuelConsumption, int price, int speed, int numberOfSeats, int currentFuel) {
        this.id = id;
        this.mark = mark;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.speed = speed;
        this.numberOfSeats = numberOfSeats;
        this.currentFuel = currentFuel;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", speed=" + speed +
                ", numberOfSeats=" + numberOfSeats +
                ", currentFuel=" + currentFuel +
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

    public int getSpeed() {
        return speed;
    }
}