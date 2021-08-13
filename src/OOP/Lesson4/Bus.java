package OOP.Lesson4;

public class Bus extends Car {
    int maxPlacesAmount;

    public Bus(Marks mark, String number, int fuelCapacity, int mileage, int maxPlacesAmount) {
        super(mark, number, fuelCapacity, mileage);
        this.maxPlacesAmount = maxPlacesAmount;
    }

    @Override
    public String toString() {
        return "BUS:\n" +
                "---------------------\n" +
                super.toString() +
                "maxSpeed: " + maxPlacesAmount + "\n" +
                "---------------------\n";
    }
}
