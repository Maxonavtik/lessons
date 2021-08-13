package OOP.lesson14.list_core;

import OOP.lesson14.list_interface.MyListInterface;
import OOP.lesson14.validator.Validator;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyArrayList<T> implements MyListInterface<T> {
    private static final int INITIAL_SIZE = 10;
    ////////////////////////////
    /* HEART OF LIST */
    private Object[] arr;
    ///////////////////////////
    private int size;

    public MyArrayList() {
        arr = new Object[INITIAL_SIZE];
    }

    public MyArrayList(int size) {
        arr = new Object[size];
    }

    @Override
    public @NotNull Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = -1;

            @Override
            public boolean hasNext() {
                ++currentIndex;
                return arr.length == currentIndex || arr[currentIndex] != null;
            }

            @Override
            public T next() {
                return (T) arr[currentIndex];
            }
        };
    }

    @Override
    public void add(int index, T data) throws Exception {
        checkResize();

        if (index == 0) {
            addFirst(data);
            return;
        } else if (index == size) {
            addLast(data);
            return;
        }

        System.arraycopy(this.arr, index, this.arr, index + 1, size - index);

        this.arr[index] = data;
        ++size;
    }

    @Override
    public void addFirst(T data) {
        checkResize();

        System.arraycopy(this.arr, 0, this.arr, 1, size);
        this.arr[0] = data;
        ++size;
    }

    @Override
    public void addLast(T data) {
        checkResize();

        this.arr[size++] = data;
    }

    @Override
    public T get(int index) throws Exception {
        Validator.checkIndex(index, this.size);

        return (T) arr[index];
    }

    @Override
    public T delete(int index) throws Exception {
        Validator.checkIndex(index, this.size);

        if (index == 0) /*-->*/ return deleteFirst();
        else if (index == size - 1) return deleteLast();

        T result = (T) arr[index];
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        arr[--size] = null;
        return result;
    }

    @Override
    public T deleteFirst() {
        T result = (T) arr[0];
        System.arraycopy(arr, 1, arr, 0, size - 1);
        arr[--size] = null;
        return result;
    }

    @Override
    public T deleteLast() {
        T result = (T) arr[--size];
        arr[size] = null;
        return result;
    }

    private void checkResize() {
        if (size == arr.length || arr.length == 0) {
            this.arr = Arrays.copyOf(this.arr, arr.length * 2 + 2);
        }
    }

    @Override
    public String toString() {
        return "MyArrayList: " + Arrays.toString(Arrays.stream(arr).filter(Objects::nonNull).toArray());
    }
}
