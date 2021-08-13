package classwork.Lesson6;

import java.util.Scanner;

public class Lesson6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        int sub = 1;

   //описали итератор     условие      шаг
        for(int i = 0; i < arr.length; i++){
            // i-тый элемент массива = число с клавы
            arr[i] = sc.nextInt(); // считали с клавиатуры число и положили в элемент массива
            if(arr[i] > 5 && arr[i] < 10){
                sum += arr[i];
            } else {
                sub *= arr[i];
            }
        }
                                           //снос строки
        System.out.println("Summa is " + sum + "\n" +
                "Subtraction is " + sub);
    }
}
