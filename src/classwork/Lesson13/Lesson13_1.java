package classwork.Lesson13;

public class Lesson13_1 {

    static boolean isFits(int number) {
        if (number / 100 == 0 && number / 100 >= 10) {
            return false; // <-- 1034 / 100 = 10,34 -> 10
        }

        int first = number / 100;
        int second = number / 10 % 10; // <-- 123 / 10 = 12 3/10 -> 12 % 10 = 1 2/10 -> 2
        int third = number % 10; // <-- 123 % 10 = 12 3/10 -> 3
                // boolean
        return first + third == second; // <-- count true or false and return it
    }

    static void findAllFitting() {
        for (int i = 100; i < 1000; i++) {
            if ( isFits(i) ) { // <-- depends of func souts number
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        findAllFitting();
    }

}
