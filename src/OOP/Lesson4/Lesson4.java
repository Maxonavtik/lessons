package OOP.Lesson4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static OOP.Lesson4.Marks.*;

public class Lesson4 {
    public static void main(String[] args) {
//        demo();

        Object obj = new Sedan(BMW, "1", 1, 1, 1);

        System.out.println(obj);

        List<Car> cars = new LinkedList<>();

        Car sedan = new Sedan(BMW, "1", 1, 1, 1);
        cars.add(sedan);
        cars.add(new Sedan(BMW, "KA1111BA", 80, 7000, 250));
        cars.add(new Bus(Bogdan, "AB4679MM", 80, 449_453, 40));
        cars.add(new Truck(KAMAZ, "BA34532AM", 150, 300_000, 13000));

        Car.print(cars);
    }

    private static void demo() {
        Autopark autopark = new Autopark();

        autopark.addSedan(new Sedan(Ford, "AA1234BB", 60, 100_000, 220));
        autopark.addSedan(new Sedan(Hyundai, "AB01001BB", 60, 223_384, 180));
        autopark.addSedan(new Sedan(BMW, "KA1111BA", 80, 7000, 250));

        autopark.addTruck(new Truck(KAMAZ, "BA34532AM", 150, 300_000, 13000));
        autopark.addTruck(new Truck(Wolf, "BA6646AN", 100, 150_000, 7000));

        autopark.addBus(new Bus(Mercedes, "AB4589NK", 70, 400_000, 20));
        autopark.addBus(new Bus(Bogdan, "AB4679MM", 80, 449_453, 40));

        autopark.printAutopark();
    }


}