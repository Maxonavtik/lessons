package OOP.Lesson1;

public class Cat {
    private String color;
    private String name;
    private int age;

    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void walk(){
        System.out.println(name + " is walking!");
    }

    public void eat(){
        System.out.println(name + " is eating!");
    }

    public void sleep(){
        System.out.println(name + " is sleeping!");
    }

    public void play(){
        System.out.println(name + " is playing!");
    }

    @Override
    public String toString(){
        return "Name " + name + "\n" +
                "Age " + age + "\n" +
                "Color " + color + "\n";
    }
}
