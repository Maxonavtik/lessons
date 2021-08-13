package homework.homework3;

import java.util.Scanner;

public class Homework3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a + b + c != 180) || (a == 90 && b == 90) || (c == 90 && b == 90) || (a == 90 && c == 90)) {
            System.out.println("This is not a triangle!");
        } else if (a == 90 || b == 90 || c == 90) {
            System.out.println("this is right triangle");
        } else if (a > 90 || b > 90 || c > 90) {
            System.out.println("this is obtuse triangle");
        } else {
            System.out.println("this is acute-angled triangle");
        }
    }
}
