package OOP.lesson13;

abstract class Human {
    abstract void sayHello();

    abstract void sayHello(String name);

    public void sayIAmHuman() {
        System.out.println("I am Human!");
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Human intelligent = new Human() {
            @Override
            void sayHello() {
                System.out.println("Hello!");
            }

            @Override
            void sayHello(String name) {
                System.out.println("Hello, " + name + "!");
            }

            @Override
            public void sayIAmHuman() {
                System.out.println("I am Intelligent!");
            }
        };

        Human gangsta = new Human() {
            @Override
            void sayHello() {
                System.out.println("Wassap!");
            }

            @Override
            void sayHello(String name) {
                System.out.println("Wassap " + name + "!");
            }
        };

        makeSMTH(gangsta);
        System.out.println("---------------------------------------");
        makeSMTH(intelligent);
    }

    static void makeSMTH(Human human) {
        human.sayHello();
        human.sayHello("partner");
        human.sayIAmHuman();
    }
}
