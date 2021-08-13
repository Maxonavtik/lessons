package classwork.Lesson2;

public class Lesson2_1 {

    public static void main(String[] args){
        int a = 1;
        int b = 2;

        // деление с остатком  %    5%2  2 [1]/2; -> 1
        // деление с целой частью  /  5/2  [2] 1/2; -> 2

        //double c = (double)(a+b) - под капотом
        double c = (double)a/b;
        int d = (int)0.5;

        double nb = 1.2;
        int v = (int)nb;
        double nb1 = 1.0;

        System.out.println(a%b);
        System.out.println(c);
        System.out.println(d);
    }
}
