package OOP.hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class City {
    public List<Street> streets;

    public City() {
        streets = new ArrayList<>();
    }

    public Street getStreet(int number) {
        return streets.get(number);
    }

    public void addStreet(int number) {
        streets.add(new Street(number));
    }

    protected void printStreetNumbers() {
        System.out.println("Available streets numbers:");
        for (int i = 0; i < streets.size(); i++) {
            System.out.println((i + 1) + ". " + streets.get(i).number);
        }
        System.out.println((streets.size() + 1) + ". Exit");
    }

    protected void printNumbersOfStreet() {
        System.out.println("Available streets numbers:");
        for (int i = 0; i < streets.size(); i++) {
            System.out.println((i + 1) + ". " + streets.get(i).number);
        }
        System.out.println((streets.size() + 1) + ". Exit");
    }

    public int getStreetsSize() {
        return streets.size();
    }

    public void print() {
        for (Street s : streets) {
            System.out.println(s);
        }
    }

    public int addLightToRandomStreet() {
        if (streets.size() == 0) {
            return -1;
        }

        int streetNumber = new Random().nextInt(streets.size());
        getStreet(streetNumber).addLight();
        return streetNumber;
    }

    public int setRandomColorForRandomStreet() {
        if (streets.size() == 0) {
            return -1;
        }

        Random random = new Random();
        int streetNumber = random.nextInt(streets.size());
        getStreet(streetNumber).changeColor( Color.values() [random.nextInt(2)] );
        return streetNumber;
    }


}
        