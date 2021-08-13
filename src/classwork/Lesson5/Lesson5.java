package classwork.Lesson5;

import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Массив на 10 эл. Заполнить и посчитать сумму значений
        System.out.println("Input size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Input " + (i+1) + " element of array:");
            arr[i] = sc.nextInt(); //ввели с клавы
            sum += arr[i]; //сразу увеличили сумму
        }

        System.out.println("Sum is " + sum);
    }
}