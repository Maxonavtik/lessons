package OOP.lesson16;

public class Main {
//    public static void main(String[] args) {
//        Apartment apartment = new Apartment(4, 84, 3, 1, 750, 1, 3, 1);
//        AbstractPlace house = new House(250, 150, 6, 2, 1000, 2, true, false);
//
//        Apartment apartment1 = new Apartment(4, 84, 3, 1, 750, 1, 3, 1) {
//            public int a = 1;
//
//            public void increment() {
//                ++a;
//            }
//
//            @Override
//            public String toString() {
//                return super.toString() + "\n-->OVERRIDDEN!";
//            }
//        };
//
//        System.out.println(apartment);
//        System.out.println(apartment1);
//    }

    public static void main(String[] args) {
//        int m = 11, d = 1, y = 70, c = 19;
//        int m = 1, d = 1, y = 21, c = 20;
        int m = 5, d = 10, y = 1, c = 20;

        System.out.println("26*m -->" + 26 * m);
        System.out.println("26*m  - 2 -->" + (26 * m - 2));
        System.out.println("(26*m - 2) / 10 -->" + (26 * m - 2) / 10);
        System.out.println("(26*m - 2) / 10 + d -->" + ((26 * m - 2) / 10 + d));
        System.out.println("(26*m - 2) / 10 + d + y -->" + ((26 * m - 2) / 10 + d + y));
        System.out.println("(26*m - 2) / 10 + d + y + y/4 -->" + ((26 * m - 2) / 10 + d + y + y / 4));
        System.out.println("(26*m - 2) / 10 + d + y + y/4 + c/4 -->" + ((26 * m - 2) / 10 + d + y + y / 4 + c / 4));
        System.out.println("(26*m - 2) / 10 + d + y + y/4 + c/4 - 2*c -->" + ((26 * m - 2) / 10 + d + y + y / 4 + c / 4 - 2 * c));
        System.out.println("((26*m - 2) / 10 + d + y + y/4 + c/4 - 2*c) % 7 -->" + (((26 * m - 2) / 10 + d + y + y / 4 + c / 4 - 2 * c) % 7));

        int res = ((26 * m - 2) / 10 + d + y + y / 4 + c / 4 - 2 * c) % 7;

        System.out.println(res);
    }
}
