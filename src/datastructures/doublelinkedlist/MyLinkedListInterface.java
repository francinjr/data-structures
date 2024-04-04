package datastructures.doublelinkedlist;

public interface MyLinkedListInterface<E> {
    void addFirst(E item) throws Exception;
    void addLast(E item) throws Exception;
    boolean addAfter(E data, E criterion) throws Exception;
    
    E peekFirst() throws Exception;
    E peekLast() throws Exception;
    
    E search(E criterion) throws Exception;
    
    E removeFirst() throws Exception;
    E removeLast() throws Exception;
    E remove(E criterion) throws Exception;
    
	void show();
	void showReverse();
}
