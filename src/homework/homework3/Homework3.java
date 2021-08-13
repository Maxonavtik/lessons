package homework.homework3;

import java.util.Scanner;

public class Homework3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input a:");
        int a = sc.nextInt();

        System.out.println("input b:");
        int b = sc.nextInt();

        System.out.println("input c:");
        int c = sc.nextInt();

        double ap = Math.pow(a, 2);
        double bp = Math.pow(b, 2);
        double cp = Math.pow(c, 2);

        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("it can't be");
        } else if (ap + bp == cp
                || ap + cp == bp
                || cp + bp == ap) {
            System.out.println("It's a right triangle");
        } else if (ap + bp < cp
                || ap + cp < bp
                || cp + bp < ap) {
            System.out.println("It's an obtuse triangle");
        } else {
            System.out.println("It`s an acute-angled triangle");
        }


    }
}