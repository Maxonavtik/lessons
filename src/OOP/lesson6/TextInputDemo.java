package OOP.lesson6;

import java.util.Scanner;

public class TextInputDemo {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input;

        while (true) {
            input = sc.nextLine();

            String[] words = input.split(" ");

            if (words[0].equalsIgnoreCase("stop")) {
                System.out.println("leaving..");
                break;
            } else if (words[0].equalsIgnoreCase("add")) {
                System.out.println("Added " + words[1]);

            } else {
                System.out.println("Not recognized!");
            }
        }
    }

}
