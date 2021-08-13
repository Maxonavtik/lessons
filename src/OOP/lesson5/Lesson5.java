package OOP.lesson5;

public class Lesson5 {

    public static void test(String str) {
        int n = Integer.parseInt(str);
        if (n < 0 || n > 100) {
            throw new IllegalArgumentException("N is out of range");
        }

        System.out.println(n);
    }

    public static void main(String[] args) {
        try {
            test("150");

        } catch (IllegalArgumentException iae) {
            System.out.print("catch -> " + iae.getMessage() + " -> ");
        } finally {
            System.out.println("finally");
        }

        try {
            test("1");

        } catch (IllegalArgumentException iae) {
            System.out.println("catch -> " + iae.getMessage() + " -> ");
        } finally {
            System.out.println("finally");
        }

        test("1");
        test("150");
    }
}
