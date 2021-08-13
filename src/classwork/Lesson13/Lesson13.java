package classwork.Lesson13;

import java.util.Scanner;

public class Lesson13 {
    //class member
    static Scanner sc = new Scanner(System.in);

    static int[] generateArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input " + (i + 1) + " element");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size");
        int size = sc.nextInt();

        System.out.println("Min is " + getMin( generateArray(size) ));
    }

}
