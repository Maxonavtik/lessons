package OOP.Lesson4;

import java.util.ArrayList;
import java.util.List;

public class Autopark {
    private final List<Sedan> sedans;
    private final List<Truck> trucks;
    private final List<Bus> buses;

    public Autopark() {
        sedans = new ArrayList<>();
        trucks = new ArrayList<>();
        buses = new ArrayList<>();
    }

    public void addSedan(Sedan car) {
        sedans.add(car);
    }

    public void addTruck(Truck car) {
        trucks.add(car);
    }

    public void addBus(Bus car) {
        buses.add(car);
    }

    public void printSedans() {
        for (Sedan s : sedans) {
            System.out.println(s);
        }
    }

    public void printTrucks() {
        for (Truck t : trucks) {
            System.out.println(t);
        }
    }

    public void printBuses() {
        for (Bus s : buses) {
            System.out.println(s);
        }
    }

    public void printCar(Car car) {
        System.out.println(car);
    }

    public void printAutopark() {
        System.out.println("AUTOPARK");
        printSedans();
        printTrucks();
        printBuses();
    }
}
