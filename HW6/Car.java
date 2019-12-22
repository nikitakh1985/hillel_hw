package HW6;

public class Car {
    private int id;
    private int price;
    private int fuelConsumption;
    private int maxSpeed;
    private String mark;

    public Car(int id, String mark, int price, int fuelConsumption, int maxSpeed) {
        this.id = id;
        this.mark = mark;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public Car(int id, String mark, int price, int maxSpeed) {
        this(id, mark, price, 0, maxSpeed);
    }
    public int getid() {
        return id;
    }
    public String getmark() {
        return mark;
    }
    public int getPrice() {
        return price;
    }
    public void setid(int id) {
        this.id = id;
    }
    public void setmark(String mark) {
        this.mark = mark;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}