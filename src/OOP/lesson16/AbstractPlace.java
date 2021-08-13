package OOP.lesson16;

public abstract class AbstractPlace {
    private final double livingSpace;
    private final int roomCount;
    private final int wcCount;
    private final int pricePerMeter;
    private final int floorCount;
    private String additional = "";

    public AbstractPlace(double livingSpace, int roomCount, int wcCount, int pricePerMeter, int floorCount) {
        this.livingSpace = livingSpace;
        this.roomCount = roomCount;
        this.wcCount = wcCount;
        this.pricePerMeter = pricePerMeter;
        this.floorCount = floorCount;
    }

    public double totalPrice() {
        return livingSpace * pricePerMeter;
    }

    public abstract void whatIsThis();

    public double getLivingSpace() {
        return livingSpace;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getWcCount() {
        return wcCount;
    }

    public int getPricePerMeter() {
        return pricePerMeter;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    @Override
    public String toString() {
        String result = ", livingSpace=" + livingSpace +
                ", roomCount=" + roomCount +
                ", wcCount=" + wcCount +
                ", pricePerMeter=" + pricePerMeter +
                ", floorCount=" + floorCount;

        if (!additional.isEmpty()) {
            result += ", additional=" + additional;
        }

        return result;
    }
}
