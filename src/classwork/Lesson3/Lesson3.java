package classwork.Lesson3;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("Input b:");
        //int b = sc.nextInt();

        /*if(a > b){
            System.out.println("a > b");
        } else if (a == b){
            System.out.println("a = b");
        } else {
            System.out.println("a < b");
        } */
        System.out.println("Input a:");
        int a = sc.nextInt();

        /*if (a < 0) {
            a = Math.abs(a);
            System.out.println("a was negative, changed to " + a);
        } else if (a > 0) {
            System.out.println("a is positive");
        } else {
            System.out.println("a = 0");
        }

         */

        if (a > 0) {
            if (a > 5) {
                System.out.println("a > 5");
            } else {
                System.out.println("a is (0;5)");
            }
        }
    }


}
