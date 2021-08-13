package classwork.Lesson8;

public class Lesson8 {

    public static void main(String... args) {

        //infinity for
        for (; ; ) {
            //System.out.println("loop");
            break; //break to stop for
        }

        int step = 0;
        for (; step < 5; step++) {
            //System.out.println(step);
        }
        //this two is equal
        for (; step < 5; ) {
            //System.out.println(step);
            step++;
        }

        for (int i = 0; i < 5; i++, System.out.println(i)) ;
        //this two is equal
        for (int i = 0; i < 5; i++) {
            //System.out.println(i);
        }
    }

}
