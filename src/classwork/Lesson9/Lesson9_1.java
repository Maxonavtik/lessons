package classwork.Lesson9;

import java.util.Scanner;

public class Lesson9_1 {

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int size = 0;

        while(size <= 0){
            System.out.println("Input array size:");
            size = sc.nextInt();

            if(size <= 0){
                System.out.println("User is a fool, try again");
            } else {
                System.out.println("Value is ok!");
            }
        }

        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }

        System.out.println("Minimum is : " + min);
    }

}
