package classwork.Lesson14;

import java.util.Scanner;

public class Lesson14 {

    static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("i = " + i + " j = " + j);
                matrix[i][j] = new Scanner(System.in).nextInt();
            }
        }

        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + "\t");
            }
        }
        System.out.println();
    }

    static int findMin(int[][] matrix){
        int min = Integer.MAX_VALUE;

        for (int[] matrixRow : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrixRow[j] < min){
                    min = matrixRow[j];
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[][] matrix = createMatrix(new Scanner(System.in).nextInt());

        printMatrix(matrix);

        System.out.println("Min is " + findMin(matrix) );

    }
}
