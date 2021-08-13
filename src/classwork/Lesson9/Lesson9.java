package classwork.Lesson9;

import java.util.Scanner;

public class Lesson9 {

    public static void main(String... args){

        Scanner sc = new Scanner(System.in);
        boolean isOK = false;
        int size = 0;

        while(!isOK){
            System.out.println("Input array size:");
            size = sc.nextInt();

            if(size <= 0){
                System.out.println("User is a fool, try again");
            } else {
                isOK = true;
                System.out.println("Value is ok!");
            }
        }

        System.out.println(size);

    }

}
