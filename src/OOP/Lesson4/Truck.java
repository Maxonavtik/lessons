package OOP.Lesson4;

public class Truck extends Car{
    int maxCarrying;

    public Truck(Marks mark, String number, int fuelCapacity, int mileage, int maxCarrying){
        super(mark, number, fuelCapacity, mileage);
        this.maxCarrying = maxCarrying;
    }

    @Override
    public String toString() {
        return  "TRUCK:\n" +
                "---------------------\n" +
                super.toString() +
                "maxSpeed: " + maxCarrying + "\n" +
                "---------------------\n";
    }
}
