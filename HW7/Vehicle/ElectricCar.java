package HW7.Vehicle;

public class ElectricCar implements Car {
    private int id;
    private String mark;
    private int fuelConsumption;
    private int price;
    private int speed;
    private int batteryCharge;

    public ElectricCar(int id, String mark, int fuelConsumption, int price, int speed, int batteryCharge) {
        this.id = id;
        this.mark = mark;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.speed = speed;
        this.batteryCharge = batteryCharge;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", speed=" + speed +
                ", batteryCharge=" + batteryCharge +
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