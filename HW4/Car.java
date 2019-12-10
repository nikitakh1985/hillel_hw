public class Car {
    int id;
    String mark;
    String model;
    int yearOfOrigin;
    String color;
    int price;
    String regMark;

    public Car(int id, String brand, String model, int yearOfOrigin, String color, int price, String regMark) {
        this.id = id;
        this.mark = brand;
        this.model = model;
        this.yearOfOrigin = yearOfOrigin;
        this.color = color;
        this.price = price;
        this.regMark = regMark;
    }

    public int workingYears() {
        return (2019 - yearOfOrigin);
    }
}