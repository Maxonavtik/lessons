package OOP.hw1;


import java.util.ArrayList;
import java.util.List;

public class Street {
    private List<Light> lights;
    public int number;

    public Street(int number) {
        lights = new ArrayList<>();
        setNumber(number);
    }

    private void setNumber(int number) {
        if (number <= 0) {
            System.out.println("invalid number");
        }
        this.number = number;
    }

    public void addLight() {
        lights.add(new Light());
    }

    public void changeColor(Color newColor) {
        for (Light l : lights) {
            l.setColor(newColor);
        }
    }

    @Override
    public String toString() {
        return "Street " + number + " COUNT " + lights.size() + "{" +
                "lights = " + lights + '}';
    }
}
