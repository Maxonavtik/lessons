package OOP.lesson7;

import java.util.Arrays;

public class ArrayResizeDemo {
    static int[] array = new int[]{1, 2, 3, 4};

    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(array));
            System.out.println("Size of array is " + array.length);
            addElement(4, 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("CATCH!");
            arrayResize();
            System.out.println(Arrays.toString(array));
            System.out.println("Size of array is " + array.length);
            addElement(4, 5);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void arrayResize() {
        int[] newArray = new int[array.length * 2 + 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public static void addElement(int index, int element) {
        array[index] = element;
        System.out.println("SUCCESS!");
    }
}
