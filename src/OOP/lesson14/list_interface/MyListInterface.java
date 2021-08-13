package OOP.lesson14.list_interface;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public interface MyListInterface<T> extends Iterable<T> {
    void add(int index, T data) throws Exception;

    void addFirst(T data);

    void addLast(T data);

    @NotNull
    @Override
    Iterator<T> iterator();

    T get(int index) throws Exception;

    /**
     * Delete element with specified index
     * @param index - index of element to delete
     * @return deleted element
     */
    T delete(int index) throws Exception;

    /**
     * Delete first element of the list
     * @return deleted element
     */
    T deleteFirst();

    /**
     * Delete last element of the list
     * @return deleted element
     */
    T deleteLast();
}
