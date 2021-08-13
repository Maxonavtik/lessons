package classwork.Lesson5;

import java.util.Scanner;

public class Lesson5_1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sub = 1;

        for(int i = 1; i < arr.length; i+=2){
            arr[i] = sc.nextInt();
            sub *= arr[i];
        }

        System.out.println(sub);
    }
}
