package OOP.lesson14;

import OOP.lesson14.list_core.MyArrayList;
import OOP.lesson14.list_core.MyLinkedList;
import OOP.lesson14.list_interface.MyListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        MyListInterface<String> ll = new MyArrayList<>(1);
        System.out.println("--> Adding section:");
        ll.addFirst("Begin");
        System.out.println(ll);

        ll.addLast("Last");
        System.out.println(ll);

        ll.add(1, "BTW");
        System.out.println(ll);

        ll.add(0, "NewBegin");
        System.out.println(ll);

        ll.add(4, "NewLast");
        System.out.println(ll);
        System.out.println("-------------------");

        System.out.println("--> Getting section:");
        System.out.println(ll.get(1));
        System.out.println("-------------------");

        System.out.println("--> Deleting section:");
        System.out.println(ll.delete(4));
        System.out.println(ll.delete(0));
        System.out.println(ll.delete(1));
        System.out.println(ll.deleteFirst());
        System.out.println(ll.deleteLast());
        System.out.println("-------------------");

        System.out.println(ll);
    }
}
