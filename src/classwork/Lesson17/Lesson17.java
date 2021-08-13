package classwork.Lesson17;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson17 {
    private static final Scanner sc = new Scanner(System.in);

    static int[] createArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    static int[] getOddElements(int[] arr) {
        int[] resArr;
        if (arr.length % 2 == 0) {
            resArr = new int[arr.length / 2];
        } else {
            resArr = new int[arr.length / 2 + 1];
        }

        for (int i = 0, j = 0; i < arr.length; i += 2) {
            System.out.println("j = " + j + " i = " + i);
            resArr[j++] = arr[i];
            System.out.println("j = " + j + " i = " + i);
            System.out.println("-----------------------");
        }

        return resArr;
    }

    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println(
                Arrays.toString(
                        getOddElements(
                                createArray(sc.nextInt())
                        ) ) );

    }

}
