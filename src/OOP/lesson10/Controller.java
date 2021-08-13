package OOP.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Controller {
    private static final Scanner sc = new Scanner(System.in);
    private final List<Section> sections = new ArrayList<>();

    public void addSection(int sectionNumber, int sectionCapacity) {
        sections.add(new Section(sectionNumber, sectionCapacity));
    }

    public void addBox(int sectionNumber, int boxNumber) {
        Section neededSection = sections.stream().filter(section -> section.getNumber() == sectionNumber).findAny().orElse(null);

        if (neededSection == null) {
            throw new NoSuchElementException("Illegal section number");
        }

        neededSection.add(boxNumber);
    }

    public Section getSection(int number) {
        return sections.stream().filter(section -> section.getNumber() == number).findAny().orElseThrow(NoSuchElementException::new);
    }

    public void printSectionNumbers() {
        for (int i = 0; i < sections.size(); i++) {
            System.out.println((i + 1) + ". " + sections.get(i));
        }
        System.out.println((sections.size() + 1) + ". Exit");
    }

    public void replaceBox(int srcSection, int destSection, int boxNumber) {
        Section src = getSection(srcSection);
        getSection(destSection).add(src.getBox(boxNumber).getNumber());
        src.remove(boxNumber);
    }

    public static void menu(Controller controller) {
        System.out.println("Input command:\n" +
                "1) Add section\n" +
                "2) Add box\n" +
                "3) Remove box\n" +
                "4) Replace box\n" +
                "5) Print\n" +
                "6) Leave\n");

        String input = sc.next();

        if (input.equalsIgnoreCase("1")) {
            try {
                System.out.println("Input number and capacity:");
                int number = Integer.parseInt(sc.next());
                int capacity = Integer.parseInt(sc.next());
                controller.addSection(number, capacity);
                menu(controller);
            } catch (NumberFormatException nfe) {
                System.out.println("ERROR");
            }

        } else if (input.equalsIgnoreCase("2")) {
            try {
                int sectionNumber = getSectionNumber(controller);
                System.out.println("Input box number:");
                int boxNumber = Integer.parseInt(sc.next());
                controller.addBox(sectionNumber, boxNumber);

            } catch (InterruptedException ie) {
                System.out.println("Leaving");
                return;
            }
            catch (IllegalArgumentException | NoSuchElementException e) {
                System.out.println("ERROR!");

            }
            menu(controller);

        } else if (input.equalsIgnoreCase("3")) {
            try {
                int sectionNumber = getSectionNumber(controller);
                System.out.println("Input number of box to delete");
                int boxNumber = Integer.parseInt(sc.next());
                Section section = controller.getSection(sectionNumber);
                section.remove(boxNumber);
                menu(controller);
            } catch (InterruptedException ie) {
                System.out.println("Leaving");
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("ERROR!");
            }
            menu(controller);

        } else if (input.equalsIgnoreCase("4")) {
            try{
                System.out.println("Input number of section to get box from, " +
                        "number of section to place and number of box to get");
                controller.printSectionNumbers();
                int srcNumber = Integer.parseInt(sc.next());
                int destNumber = Integer.parseInt(sc.next());
                int boxNumber = Integer.parseInt(sc.next());
                controller.replaceBox(srcNumber, destNumber, boxNumber);
            } catch (IllegalArgumentException | NoSuchElementException e){
                System.out.println("ERROR!");
            }
            menu(controller);

        } else if (input.equalsIgnoreCase("5")){
            System.out.println(controller);
            menu(controller);

        } else if (input.equalsIgnoreCase("6")){
            System.out.println("Leaving...");

        } else {
            System.out.println("Wrong command!");
            menu(controller);
        }
    }

    private static int getSectionNumber(Controller controller) throws InterruptedException {
        controller.printSectionNumbers();
        int sectionNumber = Integer.parseInt(sc.next());
        if (sectionNumber <= 0 || sectionNumber > controller.sections.size() + 1) {
            throw new IllegalArgumentException("No such section");
        } else if (sectionNumber == controller.sections.size() + 1) {
            throw new InterruptedException();
        }
        return sectionNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sections.forEach(section -> sb.append(section).append("\n"));
        return sb.length() == 0 ? "No sections" : sb.toString();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        menu(controller);
    }
}
