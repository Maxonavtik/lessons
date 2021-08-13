package classwork.Lesson11;

import java.math.BigInteger;
import java.util.Scanner;

public class Lesson11 {

    public static void main(String... args){
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        // for each
        for (int value: arr){
            value = new Scanner(System.in).nextInt();
            System.out.println(value);
        }

        BigInteger bigInteger = new BigInteger("1");

    }

}
