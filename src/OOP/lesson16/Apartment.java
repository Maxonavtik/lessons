package OOP.lesson16;

public class Apartment extends AbstractPlace{
    private final int floor;
    private int neighborsCount;
    private final int balconyCount;

    public Apartment(int floor, double livingSpace, int roomCount, int wcCount, int pricePerMeter, int floorCount, int neighborsCount, int balconyCount) {
        super(livingSpace, roomCount, wcCount, pricePerMeter, floorCount);
        this.floor = floor;
        this.neighborsCount = neighborsCount;
        this.balconyCount = balconyCount;
    }

    public void setNeighborsCount(int neighborsCount) {
        this.neighborsCount = neighborsCount;
    }

    public int getFloor() {
        return floor;
    }

    public int getNeighborsCount() {
        return neighborsCount;
    }

    @Override
    public void whatIsThis() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floor=" + floor +
                super.toString() +
                ", neighborsCount=" + neighborsCount +
                ", balconyCount=" + balconyCount +
                '}';
    }
}
