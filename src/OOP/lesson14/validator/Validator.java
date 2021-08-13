package OOP.lesson14.validator;

public class Validator {
    public static void checkIndex(int index, int collectionSize) throws Exception {
        if (index < 0 || index > collectionSize) {
            throw new Exception("Invalid index " + index + " for size " + collectionSize);
        }
    }

    public static void checkSize(int size) throws Exception {
        if (size < 0) {
            throw new Exception(String.format("Size %d is invalid!", size));
        }
    }
}
