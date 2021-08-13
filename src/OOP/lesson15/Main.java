package OOP.lesson15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        List<String> al = new ArrayList<>();

        long timer = System.nanoTime();
        for (int elem = 0; elem < 2000000; elem++) {
            ll.add(elem + " ELEM");
        }
        System.out.println(System.nanoTime() - timer);

        timer = System.nanoTime();
        for (int elem = 0; elem < 2000000; elem++) {
            al.add(elem + " ELEM");
        }
        System.out.println(System.nanoTime() - timer);

        timer = System.nanoTime();
        ll.add(1904350 + "");
        System.out.println("--> ll add " + (System.nanoTime() - timer));

        timer = System.nanoTime();
        al.add(1904350 + "");
        System.out.println("--> al add " + (System.nanoTime() - timer));

        timer = System.nanoTime();
        ll.get(1904350);
        System.out.println("--> ll get " + (System.nanoTime() - timer));

        timer = System.nanoTime();
        al.get(1904350);
        System.out.println("--> al get " + (System.nanoTime() - timer));
    }
}
