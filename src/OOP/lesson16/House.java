package OOP.lesson16;

public class House extends AbstractPlace {
    private final double totalSpace;
    private boolean hasPool;
    private final boolean isInTown;

    public House(double totalSpace, double livingSpace, int roomCount, int wcCount, int pricePerMeter,
                 int floorCount, boolean hasPool, boolean isInTown) {
        super(livingSpace, roomCount, wcCount, pricePerMeter, floorCount);
        this.totalSpace = totalSpace;
        this.hasPool = hasPool;
        this.isInTown = isInTown;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public double getTotalSpace() {
        return totalSpace;
    }

    @Override
    public void whatIsThis() {
        System.out.println("This is House");
    }

    public boolean hasPool() {
        return hasPool;
    }

    public boolean isInTown() {
        return isInTown;
    }

    @Override
    public String toString() {
        return "House{" +
                "totalSpace=" + totalSpace +
                super.toString() +
                ", hasPool=" + hasPool +
                ", isInTown=" + isInTown +
                '}';
    }
}
