package OOP.lesson9;

import java.util.ArrayList;
import java.util.List;

class Light {
    enum Color {
        red, green
    }

    Color color;

    public Light(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Light{" +
                "color=" + color +
                '}';
    }
}

public class Main {
//    public static void main(String[] args) {
//        int[] arr = new int[10];
//        List<String> list = new ArrayList<>();
//
//        for (int i = 1; i < 10; i++) {
//            list.add(String.valueOf(i));
//            arr[i] = i;
//
//        }
//
//        list.forEach(i -> System.out.print(i + " "));
//        System.out.println();
//        System.out.println(list);
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println("ARRAY");
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("LIST");
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//    }

    public static void main(String[] args) {
        List<Light> list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            list.add(new Light(Light.Color.values()[i % 2]));
        }
        System.out.println(list);

        for (Light light : list) {
            light.setColor(Light.Color.values()[
                    Math.abs(light.getColor().ordinal() - 1)
                    ]);
        }
        System.out.println(list);
    }

}