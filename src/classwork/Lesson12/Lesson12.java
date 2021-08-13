package classwork.Lesson12;

import java.util.Scanner;

public class Lesson12 {

    //sum count

    //zabei, tak nado
    private static final Scanner sc = new Scanner(System.in);

    // count sum of array
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    //create array
    public static int[] getArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input " + i + " elem:");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    //main
    public static void main(String[] args) {

        System.out.println("Input size:");
        int size = sc.nextInt();


        System.out.println( getSum( getArray(size) ) );
    }
}
