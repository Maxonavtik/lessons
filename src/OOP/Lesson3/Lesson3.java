package OOP.Lesson3;

public class Lesson3 {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Angle(59, 30),
                new Angle(100, 29, 3),
                new Angle(20, 0, 57));

        Triangle.getTriangleType(triangle);
    }

}
