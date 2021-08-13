package OOP.lesson10;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Section {
    private int number;
    private final Box[] boxes; // final ???
    private int index = 0;

    public Section(int number, int capacity) {
        setNumber(number);
        boxes = new Box[capacity];
    }

    private void setNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Box getBox(int number) {
        return Arrays.stream(boxes).filter(box -> box.getNumber() == number).findAny().orElseThrow(NoSuchElementException::new);
    }

    public void remove(int number) {
        if (index > boxes.length) throw new IllegalArgumentException("Illegal removeBox arg");

        int boxToDeleteIndex = -1;
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i].getNumber() == number) {
                boxToDeleteIndex = i;
                break;
            }
        }

        if (boxToDeleteIndex == -1) throw new NoSuchElementException("No such box found!");

        if (boxToDeleteIndex != boxes.length - 1) {
            System.arraycopy(boxes, boxToDeleteIndex + 1, boxes, boxToDeleteIndex,
                    boxes.length - 1 - boxToDeleteIndex);
            boxes[index--] = null;
        } else {
            boxes[boxToDeleteIndex] = null;
        }
    }

    public void add(int number) {
        if (index >= boxes.length) {
            throw new IllegalStateException("Out of place!");
        }

        boxes[index++] = new Box(number);
    }

    @Override
    public String toString() {
        return "SECTION " + number + ": " +
                Arrays.toString(Arrays.stream(boxes)
                        .filter(Objects::nonNull)
                        .toArray()
                );
    }
}
