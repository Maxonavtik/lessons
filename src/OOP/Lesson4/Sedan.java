package OOP.Lesson4;

public class Sedan extends Car {
    private int maxSpeed;

    public Sedan(Marks mark, String number, int fuelCapacity, int mileage, int maxSpeed){
        super(mark, number, fuelCapacity, mileage);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void start(){
        Lesson4.main(null);
    }

    @Override
    public String toString() {
        return  "SEDAN:\n" +
                "---------------------\n" +
                super.toString() +
                "maxSpeed: " + maxSpeed + "\n" +
                "---------------------\n";
    }
}