package OOP.lesson11;

import java.util.ArrayList;
import java.util.List;

class Car implements Rideable{
    public int price;
    public String model;

    public Car(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void ride() {
        System.out.println("Car is riding!");
    }

    @Override
    public void boom() {
        System.out.println("Car is destroyed!");
    }
}

class Autopark {
    List<Rideable> cars = new ArrayList<>();

    public Autopark() {

    }

    public void add(Rideable car){
        cars.add(car);
    }
}

interface Rideable {
    void ride();

    void boom();

    default void rideBlinded() {
        System.out.println("Ride blinded!");
    }
}


public class Lesson11 {
    public static void main(String[] args) {
        Autopark autopark = new Autopark();

        autopark.add(new Car(100000, "Tesla"));
        autopark.add(new Rideable() {
            @Override
            public void ride() {
                System.out.println("Lambda1 is riding");
            }

            @Override
            public void boom() {
                System.out.println("Lambda1 is destroyed!");
            }
        });

        autopark.cars.forEach(Rideable::ride);
        System.out.println("-----------------------------------");
        autopark.cars.forEach(Rideable::rideBlinded);
        System.out.println("-----------------------------------");
        autopark.cars.forEach(Rideable::boom);
    }
}
