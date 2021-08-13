package homework.homework2;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input a");
        int a = sc.nextInt();

        if(a > 4 && a < 16){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
