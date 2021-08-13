package classwork.Lesson3;

public class Lesson3_1 {

    public static void main(String[] args) {
        String a = "Hello world!";
        String b = "!!";
        a = a.replaceAll("Hello", "Hey");
        int c = 50;
        //Hello world! + !!
        System.out.println(a + b + " " + c + " time again...");
    }
}
