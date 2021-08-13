package OOP.lesson8;

public class StringBuilderDemo {
    public static void main(String[] args) {
        tryCatchDemo();
    }

    static void tryCatchDemo() {
        try {
            sbDemo();
        } catch (IllegalArgumentException re) {
            System.out.println("ERROR");
        }
    }

    private static void sbDemo() {
        String[] arr = new String[]{"a", "", ""};

        StringBuilder sb = new StringBuilder();

        sb.append("Bag: ");
        for (String s : arr) {
            if (!s.equalsIgnoreCase("")) {
                sb.append(s).append(" ");
            }
        }

        System.out.println(sb);
    }
}
