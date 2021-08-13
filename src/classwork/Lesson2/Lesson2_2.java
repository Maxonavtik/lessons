package classwork.Lesson2;

public class Lesson2_2 {

    public static void main(String[] args) {

        // boolean принимает два значения: true или false
        // Рассмотрим случай, когда надо проверить пол человека. Допустим, человек - мальчик.
        boolean isBoy = true;
        boolean isGirl = false;

        int a = 1;
        int b = 5;

        boolean isHigher = a > b;
        System.out.println("IsHigher: " + isHigher);

        boolean isEqual = a == b;
        System.out.println("isEqual" + isEqual);

        boolean isHigherOrEqual = a >= b;
        System.out.println("isHigherOrEqual: " + isHigherOrEqual);

        boolean isLowerOrEqual = a <= b;
        System.out.println("isLowerOrEqual: " + isLowerOrEqual);
        System.out.println("NOT isLowerOrEqual: " + !isLowerOrEqual); // ! - не (отрицание)

        boolean isNotEqual = a > b && a < b && b == 5; // && - И (логическое)
        // a > b = false, a < b = true  =>  && = true if all operands is true else && = false
        System.out.println("isNotEqual: " + isNotEqual);

        boolean OrLogical = a > 5 || a < 2 || a == 1; // || - ИЛИ (логическое) (shift + backslash = |)
        // || = true if at least one of operands is true;
        System.out.println("OrLogical: " + OrLogical);
    }
}
