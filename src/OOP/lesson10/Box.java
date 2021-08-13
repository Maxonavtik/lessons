package OOP.lesson10;

public class Box {
    private final int number;

    public Box(int number){
        if(number <= 0 || number > 100){
            throw new IllegalArgumentException(); // <-- throwing exception to block initialization
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "BOX " + number;
    }
}
