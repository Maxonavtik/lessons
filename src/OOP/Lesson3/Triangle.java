package OOP.Lesson3;

public class Triangle {
    public Angle angleA;
    public Angle angleB;
    public Angle angleC;

    public Triangle(Angle angleA, Angle angleB, Angle angleC) {
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
    }

    public boolean isExists() {
        if(angleA.is90Degrees() && angleB.is90Degrees()
        || angleA.is90Degrees() && angleC.is90Degrees()
        || angleC.is90Degrees() && angleB.is90Degrees()){
            return false;
        }

        Angle result = Angle.addAngles(Angle.addAngles(angleA, angleB), angleC);

        return result.getDegrees() == 180
                && result.getMinutes() == 0
                && result.getSeconds() == 0;
    }

    public static void getTriangleType(Triangle triangle) {
        if (!triangle.isExists()) {
            System.out.println("This is not a triangle!");
            return;
        }

        if (triangle.angleA.getDegrees() <= 60
                && triangle.angleB.getDegrees() <= 60
                && triangle.angleC.getDegrees() <= 60) {
            System.out.println("This is obtuse triangle");

        } else if (triangle.angleA.is90Degrees()
                || triangle.angleB.is90Degrees()
                || triangle.angleC.is90Degrees()) {
            System.out.println("This is right triangle");

        } else {
            System.out.println("This is an acute-angled triangle");
        }
    }
}
