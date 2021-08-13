package OOP.hw1;


public class Light {
    private Color color;

    public Light() {
        setColor(Color.GREEN);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color.toString();
    }

}
