package classwork.Lesson18;

import java.util.Arrays;

public class Lesson18 {

    public static void main(String... args){
        int[] dArr = new int[10];

        for(int i = 0; i < dArr.length; i++){
            dArr[i] = i+1;
        }

        System.out.println(Arrays.toString(dArr));

        dArr = new int[10];
        Arrays.fill(dArr, 0);

        System.out.println(Arrays.toString(dArr));
    }
}
