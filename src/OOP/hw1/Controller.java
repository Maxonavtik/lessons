package OOP.hw1;

import java.util.Scanner;

public class Controller {
    private static final Scanner sc = new Scanner(System.in);

    private static void showMenu(City city) {
        System.out.println("\nMenu:\n" +
                "1. Add street\n" +
                "2. Add light\n" +
                "3. Set color for chosen street\n" +
                "4. Print\n" +
                "5. Leave\n" +
                "6. Add light to random street\n" +
                "7. Set random color for random street");
        System.out.println("Input command:");

        int choice = -1;
        try {
            choice = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("--> Incorrect input!");
            showMenu(city);
        }

        if (choice == 1) {
            try {
                System.out.println("Input street number:");
                int number = Integer.parseInt(sc.next());
                city.addStreet(number);
                System.out.println("--> Street " + number + " added!");
                showMenu(city);
            } catch (NumberFormatException e) {
                System.out.println("--> Incorrect street number");
                showMenu(city);
            }

        } else if (choice == 2) {
            try {
                city.printStreetNumbers();
                int number = Integer.parseInt(sc.next());

                if (number == city.getStreetsSize() + 1) {
                    System.out.println("Exiting...");
                } else if (number < 1 || number > city.getStreetsSize()) {
                    System.out.println("Incorrect number");
                } else {
                    city.getStreet(number - 1).addLight();
                    System.out.println("--> Light was added");
                }
                showMenu(city);
            } catch (NumberFormatException e) {
                System.out.println("--> Incorrect street number");
                showMenu(city);
            }

        } else if (choice == 3) {
            try {
                city.printStreetNumbers();
                int number = Integer.parseInt(sc.next());

                if (number == city.getStreetsSize() + 1) {
                    System.out.println("Exiting...");
                } else if (number < 1 || number > city.getStreetsSize()) {
                    System.out.println("Incorrect street number");
                } else {
                    System.out.println("Choose color:\n" +
                            "1. Green\n" +
                            "2. Red\n");
                    int color = Integer.parseInt(sc.next());

                    if (color == 1 || color == 2) {
                        city.getStreet(number - 1).changeColor(Color.values()[color - 1]);
                    } else {
                        System.out.println("--> Incorrect color number");
                        showMenu(city);
                    }
                }
                showMenu(city);

            } catch (NumberFormatException e) {
                System.out.println("--> Incorrect street number");
                showMenu(city);
            }

        } else if (choice == 4) {
            city.print();
            showMenu(city);

        } else if (choice == 5) {
            System.out.println("Leaving...");

        } else if (choice == 6) {
            System.out.println("--> Light was added to street " + (city.addLightToRandomStreet() + 1));
            showMenu(city);

        } else if (choice == 7) {
            System.out.println("--> Color was changed for street " + city.setRandomColorForRandomStreet());
            showMenu(city);
        }
    }

    private static void ShowMenu(City city) {
        System.out.println(
                "Input command \n" +
                        "1) Add Street \n" +
                        "2) Add Light \n" +
                        "3) Set color \n" +
                        "4) Print \n" +
                        "5) Leave \n"
        );

        System.out.println("Input number of your command");
        int choice;

        try {
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException a) {
            choice = -1;
        }
        if (choice == 1) {
            try {
                System.out.println("Input number");
                int number = Integer.parseInt(sc.nextLine());
                city.addStreet(number);
            } catch (NumberFormatException a) {
                System.out.println("ERROR");

            }
            ShowMenu(city);
        } else if (choice == 2) {
            try {
                city.printNumbersOfStreet();
                int number = Integer.parseInt(sc.nextLine());

                if (number > city.streets.size()) {
                    System.out.println("Error");
                } else if (number < 1 ||number > city.streets.size()) {
                    System.out.println("Error");

                } else {
                    city.streets.get(number - 1).addLight();
                    System.out.println("Light was added");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("ERROR");
            }
            ShowMenu(city);
        } else if (choice == 3) {
            try {
                city.printNumbersOfStreet();
                int s = Integer.parseInt(sc.nextLine());
                if (s > city.streets.size()) {
                    System.out.println("ERROR");
                }
                else {
                    System.out.println("Chose color:\n" +
                            "1) GREEN\n" +
                            "2) RED\n");

                    int color = Integer.parseInt(sc.nextLine());
                    if (color != 1 && color != 2) {
                        System.out.println("ERROR");
                    } else {
                        city.streets.get(s).changeColor(Color.values()[color - 1]);
                    }
                }

            } catch (NumberFormatException nfe) {
                System.out.println("ERROR");
            }
            ShowMenu(city);
        } else if (choice == 4) {
            city.print();
        } else if (choice == 5) {
            System.out.println("THE END!!! you won this game");

        } else {
            System.out.println("ERROR");
        }

    }

    public static void main(String[] args) {
        City city = new City();
        ShowMenu(city);
    }
}