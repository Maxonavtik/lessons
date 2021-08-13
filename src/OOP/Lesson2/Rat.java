package OOP.Lesson2;

enum Hair {
    bold,
    hairy
}

public class Rat {
    private String color;
    private Hair hair;
    private String name;
    private int age;

    //Overload --> перегрузка
    public Rat(String name, int age, String color, Hair hair) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.hair = hair;
    }

    public Rat(String color, Hair hair){
        setAge(0);
        setName("Unknown");
        setColor(color);
        setHair(hair);
    }

    public Rat(){
        setAge(2);
        setName("Ratta");
        setColor("Grey");
        setHair(Hair.hairy);
    }
    // <--

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }


    public void hunting() {
        System.out.println(name + "is hunting");
    }

    public void eating() {
        System.out.println(name + "is eating");
    }

    public void sleeping() {
        System.out.println(name + "is sleeping");
    }

    public void running() {
        System.out.println(name + "is running");
    }


    @Override
    public String toString() {
        return "Name " + name + "\n" +
                "Age " + age + "\n" +
                "Color " + color + "\n" +
                "Hair " + hair + "\n";
    }
}