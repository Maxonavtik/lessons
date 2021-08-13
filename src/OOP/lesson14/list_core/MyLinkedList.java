package OOP.lesson14.list_core;


import OOP.lesson14.list_interface.MyListInterface;
import OOP.lesson14.validator.Validator;
import org.jetbrains.annotations.NotNull;


import java.util.Iterator;

public class MyLinkedList<T> implements MyListInterface<T> {

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T tmp = current.data;
                current = current.next;
                return tmp;
            }
        };
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> previous;

        Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public void add(int i, T data) throws Exception {
        Validator.checkIndex(i, size);
        if (i == 0) {
            addFirst(data);
            return;
        } else if (i == size) {
            addLast(data);
            return;
        }

        Node<T> node = head;
        // 1 `cause we already have pointer on head
        for (int nodeNumber = 1; nodeNumber < i; nodeNumber++) {
            node = node.next;
        }

        Node<T> node1 = new Node<>(data);
        node1.previous = node;
        node1.next = node.next;
        node.next.previous = node1;
        node.next = node1;
        ++size;
    }

    @Override
    public void addFirst(T data) {
        if (head == null) {
            head = new Node<>(data);
            ++size;
            return;
        }
        Node<T> node = new Node<>(data);
        head.previous = node;
        node.next = head;
        head = node;
        ++size;
    }

    @Override
    public void addLast(T data) {
        if (head == null) {
            addFirst(data);
            return;
        }

        Node<T> node = head;

        while (node.next != null) {
            node = node.next;
        }

        node.next = new Node<>(data);
        node.next.previous = node;
        ++size;
    }

    @Override
    public T get(int index) throws Exception {
        Validator.checkIndex(index, size);

        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    @Override
    public T delete(int index) throws Exception {
        if (index == 0 && head != null) /*-->*/ return deleteFirst();
        else if (index == (size - 1) && head != null) /*-->*/ return deleteLast();

        Validator.checkIndex(index, size);

        Node<T> node = head;
        for (int nodeNumber = 0; nodeNumber < index; nodeNumber++, node = node.next);

        node.next.previous = node.previous;
        node.previous.next = node.next;
        --size;

        return node.data;
    }

    @Override
    public T deleteFirst() {
        if (size == 1) {
            T result = head.data;
            head = null;
            size = 0;
            return result;
        }
        if (head == null) /*-->*/ throw new IllegalStateException("List is empty, nothing to delete");

        T result = head.data;
        head = head.next;
        head.previous = null;
        --size;

        return result;
    }

    @Override
    public T deleteLast() {
        if (size == 1) /*-->*/ return deleteFirst();
        if (head == null) /*-->*/ throw new IllegalStateException("List is empty, nothing to delete");

        Node<T> node = head;
        for (int nodeNumber = 1; nodeNumber < size; nodeNumber++){
            node = node.next;
        }

        T result = node.data;
        node.previous.next = null;
        --size;

        return result;
    }

    @Override
    public String toString() {
        if (head == null) /*-->*/ return "[]";

        StringBuilder sb = new StringBuilder("[ ");

        for (T t : this) {
            sb.append(t).append(", ");
        }

        return sb.deleteCharAt(sb.length() - 2).append("]").toString();
    }
}