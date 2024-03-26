package datastructures.stackusingarray;

public class MyStackUsingArray<T> implements MyStackInterface<T> {

    private int maxSize;
	private Object[] array;
	private int top;

    public MyStackUsingArray(int size) {
        this.maxSize = size;
        array = new Object[size];
        top = -1;
    }

    @Override
    public void push(T item) {
        if(isFull()) {
            throw new MyStackException("A pilha está cheia. Não foi possível adicionar o elemento");
        }

        top = top + 1;
        array[top] = item;

        System.out.println("O elemento foi empilhado!");
    }

    
    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        if(isEmpty()) {
            throw new MyStackException("A pilha está vázia. Não foi possível remover o elemento");
        }

        T oldTopElement = (T) array[top];
        top = top - 1;

        System.out.println("O elemento foi desempilhado");
        return oldTopElement;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        if(isEmpty()) {
            throw new MyStackException("A pilha está vázia. Não há elemento para ser retornado");
        }
	    
	    T topElement = (T) array[top];
		System.out.println("\nConsultando o elemento que está no topo da pilha.");

        return topElement;
    }

    @Override
    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if(top == maxSize - 1) {
            return true;
        }
        return false;
    }

    @Override
    public void show() {
        for(int i = 0; i <= top; i++) {
            System.out.println("\nElemento da posição " + i + "= " + array[i]);
        }
        System.out.println("\nÍndice do topo = " + top);
    }
    
}
