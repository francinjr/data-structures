package queueusingarray;

public interface MyQueueInterface<T> {
    void add(T number) throws MyQueueException;
    T remove() throws MyQueueException;
    
    T peek() throws MyQueueException;
    
    boolean isEmpty();
    boolean isFull();
    
    void show();
}
