package classwork.Lesson8;

public class Lesson8_3 {

    public static void main(String... args) {

        int count = 0;
        for (int i = 100; i < 1000; i++) {
            //143 1+3 = 4

            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;

            if (a + c == b) {
                ++count;
                System.out.println(i);
            }

        }

        System.out.println("Count of numbers is " + count);

    }
}
