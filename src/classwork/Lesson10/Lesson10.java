package classwork.Lesson10;

import java.util.Scanner;

public class Lesson10 {

    public static int findMinInt(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }
        System.out.println("!!!Min is " + min);
        return min;
    }

    public static void findMinVoid(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Min is " + min);
    }

    public static Scanner initScanner() {
        System.out.println("Scanner init in process...");
        System.out.println("Done!");
        return new Scanner(System.in);
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input " + ++i + "element");
            arr[i] = initScanner().nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = initScanner();

        int[] marks = new int[10];
        fillArray(marks);

        int min1 = findMinInt(marks);
        System.out.println("Min is " + min1);

        marks[0] = 2;

        findMinVoid(marks);

    }
}
