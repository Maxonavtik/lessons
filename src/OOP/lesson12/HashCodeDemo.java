package OOP.lesson12;

public class HashCodeDemo {
    private static class Bean {
        int id;
        String field;

        public Bean(int id, String field) {
            this.id = id;
            this.field = field;
        }

        @Override
        public int hashCode() {
            return toString().hashCode(); //hash codes need to be similar for two equal objects
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Bean)) {
                return false;
            }

            return this.toString().equals(obj.toString());
        }

        @Override
        public String toString() {
            return "Bean contains : \nid : " + id + "\nfield : " + field;
        }
    }

    public static void main(String[] args) {
        Bean b = new Bean(1, "Field");
        Bean b1 = new Bean(10, "Ababagalamaga");
        Bean b2 = new Bean(7, "alkfaslkfjalkfjalskfjalksfjlaskfj");
        Bean b3 = new Bean(7, "alkfaslkfjalkfjalskfjalksfjlaskfj");
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("--> b hash " + b.hashCode());
        System.out.println("--> b1 hash " + b1.hashCode());
        System.out.println("--> b2 hash " + b2.hashCode());
        System.out.println("--> b3 hash " + b3.hashCode());
        System.out.println("--> b2 equals b3 " + b2.equals(b3));
    }
}
