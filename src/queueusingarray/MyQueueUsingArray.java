package queueusingarray;

public class MyQueueUsingArray<T> implements MyQueueInterface<T> {

    private int maxSize;
    private int first;
    private int last;
    private Object[] array;

    public MyQueueUsingArray(int maxSize) {
        this.maxSize = maxSize;
        this.first = -1;
        this.last = -1;
        this.array = new Object[maxSize];
    }

    @Override
    public void add(T element) throws MyQueueException {
        int lastTemp = (last + 1) % maxSize;

	    if (lastTemp == first) {
            throw new MyQueueException("Não foi possível adicionar o elemento na fila, pois a fila está cheia.");
	    }

        last = lastTemp;
        array[last] = element;

        if(first == -1) {
            first = 0;
        }

        System.out.println("Elemento adicionado na fila.");
    }

    
    @Override
    @SuppressWarnings("unchecked")
    public T remove() throws MyQueueException {
        if(first == -1) {
            throw new MyQueueException("Não foi possível remover o elemento da fila, pois a fila está vázia.");
        }

        T removedElement = (T) array[first];

        if (first == last) {
            first = -1;
            last = -1;
        } else {
            first = (first + 1) % maxSize;
        }

        return removedElement;
    }

    
    @Override
    @SuppressWarnings("unchecked")
    public T peek() throws MyQueueException {
        if(isEmpty()) {
            throw new MyQueueException("A pilha está vázia.");
        }

        T firstElement = (T) array[first];
        return firstElement;
    }

    @Override
    public boolean isEmpty() {
        if(first == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        int lastTemp = (last + 1) % maxSize;

        if(lastTemp == first) {
            return true;
        }
        return false;
    }

    @Override
    public void show() {
		System.out.println("\nExibindo os elementos da fila: \n");
		
	    int i = first;
	    
	    if(first == -1) {
	    	return;
	    }
	    	    
	    while(i != last)
	    {
	    	System.out.println("\nElemento da posicao " + i + " = " + array[i]);

	        i = (i + 1) % maxSize;
	    }
	    System.out.println("\nPosição " + i + "= " + array[i]);
		System.out.println("\nInicio = " + first + "  ,Fim = " + last);
    }
    
}
