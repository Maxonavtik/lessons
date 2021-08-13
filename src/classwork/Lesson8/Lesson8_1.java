package classwork.Lesson8;

public class Lesson8_1 {

    public static void main(String... args){
        boolean isFive = false;
        int a = 0;

        while (!isFive) {
            System.out.println(a);
            if(a == 5){
                isFive = true;
                System.out.println("Gotcha!");
            }
            ++a;
        }
    }
}
