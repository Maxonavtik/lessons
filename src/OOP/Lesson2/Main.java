package OOP.Lesson2;

import java.util.Scanner;

public class Main {
    private static Rat generateRat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name");
        String name = sc.nextLine();
        System.out.println("Input age");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Input color");
        String color = sc.nextLine();

        return new Rat(name, age, color, Hair.bold);
    }

    public static void main(String[] args) {
        //Polymorphism --> полиморфизм --> много форм с греческого
        // все объекты - крысы, но разные
        Rat rat1 = new Rat();
        Rat rat2 = new Rat("Blue", Hair.bold);
        Rat rat3 = new Rat("No name", 2, "Color", Hair.bold);

        Rat rat4 = generateRat();

        /*System.out.println(rat1);
        System.out.println(rat2);
        System.out.println(rat3);*/
        System.out.println("-------------");
        System.out.println(rat4);
    }
}
