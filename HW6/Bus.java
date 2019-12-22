package HW6;

public class Bus extends Car {
    private int numberOfSeats;

    public Bus(int id, String mark, int price, int fuelConsumption, int maxSpeed, int numberOfSeats) {
        super(id, mark, price, fuelConsumption, maxSpeed);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    @Override
    public String toString() {
        return "ID: " + getid() + " " + getmark() + "  " + "Bus [numberOfSeats="
                + numberOfSeats + ", price=" + getPrice() +
                ", fuelConsumption=" + getFuelConsumption() + ", maxSpeed=" + getMaxSpeed() + "]";
    }

}