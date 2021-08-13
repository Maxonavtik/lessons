package OOP.Lesson3;

public class Angle {
    private int degrees;
    private int minutes;
    private int seconds;

    public Angle(int degrees, int minutes, int seconds) {
        setSeconds(seconds);
        setMinutes(minutes);
        setDegrees(degrees);
    }

    public Angle(int degrees, int minutes) {
        this.seconds = 0;
        setMinutes(minutes);
        setDegrees(degrees);
    }

    public Angle(int degrees) {
        this.seconds = 0;
        this.minutes = 0;
        setDegrees(degrees);
    }

    private void setDegrees(int degrees) {
        if (degrees < 0) {
            System.out.println("Seconds is lower than null\n" +
                    "User is a dick!");
            return;
        }

        this.degrees = (degrees + this.degrees) % 360;


    }

    private void setMinutes(int minutes) {
        int minutesActual = this.minutes + minutes;

        if (minutesActual < 0) {
            System.out.println("Minutes is lower than null\n" +
                    "User is a dick!");
            return;
        }

        if (minutesActual / 60 != 0) {
            this.degrees += minutesActual / 60;
        }

        this.minutes = minutesActual % 60;

    }

    private void setSeconds(int seconds) {
        if (seconds < 0) {
            System.out.println("Seconds is lower than null\n" +
                    "User is a dick!");
            return;
        }

        if (seconds / 60 != 0) {
            this.minutes += seconds / 60;
        }

        this.seconds = seconds % 60;

    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean is90Degrees(){
        return this.degrees == 90
                && this.minutes == 0
                && this.seconds == 0;
    }

    public static Angle addAngles(Angle a1, Angle a2){
        if (a1 == null || a2 == null){
            throw new IllegalArgumentException("User is a dick! One of args is null!");
        }

        int sumSec = a1.seconds + a2.seconds;
        int sumMin = a1.minutes + a2.minutes;
        int sumDeg = a1.degrees + a2.degrees;

        return new Angle(sumDeg, sumMin, sumSec);
    }

    @Override
    public String toString() {
        return degrees + "* " + minutes + "' " + seconds + '"';
    }
}
