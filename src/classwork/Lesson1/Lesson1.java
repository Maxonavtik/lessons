package classwork.Lesson1;

public class Lesson1 {

    public static void main(String[] args) { //точка входа

        int a = 1; byte v = 2; long l = 3; //целочисленные

        double b = 1.2; float f = 2.3f; // с плавающей точкой

        char ch = ' '; // символьный

        int addition = 1 + 1;
        int subtraction = a - 1;
        int multiplication = a * a;
        int division = a / 1;

        double dpi = 1 + 2.3; // int + double -> double

        int result = addition + multiplication;

        // sout + Tab -> System.out.println();
        System.out.println(addition + " " + subtraction);
        System.out.println("Addition: " + addition + " Subtraction: " + subtraction);
        System.out.print(addition + multiplication + " "); // 2 + 1 = 3 -> вывелось
        System.out.println(result + multiplication + addition + result); //3 + 2 + 1 + 3 = 9 -> вывелось
        System.out.println("Hello world !!!");
    }
}
