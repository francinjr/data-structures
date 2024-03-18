package datastructures.stack;

public interface MyStackInterface<E> {
    void push(E item);

    E pop();

    E peek();

    boolean isEmpty();

    boolean isFull();

    void show();
} 