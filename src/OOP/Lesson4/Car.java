package OOP.Lesson4;

import java.util.List;

public class Car { // <-- super class for cars
    protected Marks mark; //
    private String number; //
    private final int fuelCapacity; // <-- general fields for all cars
    private int mileage; //

    public Car(Marks mark, String number, int fuelCapacity, int mileage){
        this.mark = mark;
        this.number = number;
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
    }

    public Marks getMark() {
        return mark;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void print(){
        System.out.println(this);
    } // <-- sout itself

    public static void print(Car car){
        System.out.println(car);
    } // <-- sout some car

    public static void print(List<Car> cars){
        for(Car car : cars){
            print(car);
        }
    } // <-- sout list of cars

    @Override
    public String toString() {
        return "mark: " + mark + "\n" +
                "number: " + number + "\n" +
                "fuel capacity: " + fuelCapacity + "\n" +
                "mileage: " + mileage + "\n";
    }
}
