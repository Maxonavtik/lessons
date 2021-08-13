package OOP.lesson7;

import java.util.Scanner;

public class Main {
    private static final Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        String input = "";

        while(!input.equalsIgnoreCase("stop")){
            input = sc.nextLine();
            String[] words = input.split(" "); // <-- "ADD word" -> "ADD", "word"
            if(words[0].equalsIgnoreCase("ADD")){
                System.out.println("ADD");
                //addWord(words[1])
            } else if (words[0].equalsIgnoreCase("FIND")) {
                System.out.println("FIND");
            } else if (words[0].equalsIgnoreCase("stop")){
                System.out.println("Leaving...");
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
}
