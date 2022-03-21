package day1503;

import java.util.Objects;

public class Car {
    private String model;
    private int year;
    private String color;
    private Engine engine;

    public Car() {
    }

    public Car(String model, int year, String color, Engine engine) {
        this.color = color;
        this.year = year;
        this.model = model;
        this.engine=engine; //agregation
        //this.engine = new Engine() ;//composition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int hushCode() {
        int hash = 1;
        hash = hash * 11 + ((model == null) ? 0 : model.hashCode());
        hash = hash * 11 + year;
        return hash;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return this.model.equals(car.model) &&
                this.year == car.year &&
                (this.model != null) &&
                this.engine.equals(car.engine);

    }

    public static void main(String[] args) {
        Engine engine = new Engine(24, 25, 22);
        Engine engine1 = new Engine(24, 25, 32);
        Car c1 = new Car("BMW", 2012, "red", engine);
        Car c2 = new Car("BMW", 2012, "red", engine1);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hushCode());
        System.out.println(c2.hushCode());
    }
}
