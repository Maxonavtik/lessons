package classwork.Lesson8;

import java.util.Scanner;

public class Lesson8_2 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();

        int first = var / 10; // 12/10 = 1.2 -> 1
        int second = var / 2; // 12%10 = 1 2/10 -> 2

        //123
        int first1 = var / 100; // 123/100 = 1.23 -> 1
        int second1 = var / 10 % 10; //123/10 -> 12% 0 -> 2
        int third1 = var % 10; // 123%10 = 12 3/10 -> 3

        //1234
        int first2 = var / 1000; //1234/1000 = 1.234 -> 1
        int second2 = var / 100 % 10; // 1234/100 = 12.34 -> 12%10 = 1 2/10 -> 2
        int third2 = var / 10 % 10; // 1234 / 10 = 123.4 -> 123 % 10 = 12 3/10 - > 3
        int fourth = var % 10; // 1234%10 = 123 4/10 -> 4

    }
}
