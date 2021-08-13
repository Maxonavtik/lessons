package OOP.lesson9;

public class Bag {

    private int index = 0;
    private String[] bag = new String[1];

    public void add(String thing) {
        if (thing == null || thing.isEmpty()) {
            System.out.println("Invalid Thing. Please, try to input it again");
            return;
        }

        for (String e : bag) {
            if (e == null) {
                break;
            } else if (e.equalsIgnoreCase(thing)) {
                System.out.println("Already in the bag");
                return;
            }
        }

        if (index >= bag.length) {
            arrayResize();
        }

        bag[index++] = thing;
    }

    public void remove() {
        if (index == 0) {
            System.out.println("ERROR!");
        } else {
            bag[--index] = null;
        }
    }

    private void arrayResize() {
        String[] newArray = new String[bag.length * 2 + 2];
        System.arraycopy(bag, 0, newArray, 0, bag.length);
        bag = newArray;
        System.out.println("resized");
    }

    public void print() {
        if (bag[0] == null) {
            System.out.println("empty");
        } else {
            StringBuilder stringBuilder = new StringBuilder("Bag: {");

            for (String s : bag) {
                if (s == null) {
                    break;
                }
                stringBuilder.append(s).append(", ");
            }

            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length() - 1, "}");

//        stringBuilder.setCharAt(stringBuilder.length() - 1, '}');

            System.out.println(stringBuilder.toString());
        }
    }

}