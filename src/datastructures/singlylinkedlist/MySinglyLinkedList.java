package datastructures.singlylinkedlist;

public class MySinglyLinkedList<E> implements MyLinkedListInterface<E> {

    class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public MySinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

    @Override
    public void addFirst(E item) {
        Node newNode = new Node(item);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(E item) {
        Node newNode = new Node(item);

        if(tail == null) {
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public boolean addAfter(E data, E criterion) throws Exception {
	    Node p = searchNode(criterion);

	    if(p == null)	{    
	        System.out.println("\nCriterio invalido.");
	        return false;
	    } else {
	        Node newNode = new Node(data);

	        if(p.next == null) {
	        	tail = newNode;
	        }
	        

	        newNode.next = p.next;
		    p.next = newNode;
		    
		    size++;
		    return true;
	    }
    }


    public Node searchNode(E criterion) {
        Node p = head;

        while(p != null) {
            if(p.data.equals(criterion)) {
                return p;
            }
            p = p.next;
        }
        return null;
    }


    @Override
    public E peekFirst() throws Exception {
        if(head == null) {
            throw new Exception("A lista está vazia");
        }
        return head.data;
    }

    @Override
    public E peekLast() throws Exception {
        if(tail == null) {
            throw new Exception("A lista está vazia");
        }
        return tail.data;
    }

    @Override
    public E search(E criterion) throws Exception {
        Node p = searchNode(criterion);

        if(p == null) {
            return null;
        }
        return p.data;
    }


    @Override
	public E removeFirst() throws Exception{
		Node p = head;
		E returnData = null;

		if(head == null) {
	        throw new Exception("A lista está vazia");
	    } else {
			returnData = head.data;
			
			if (head == tail) {
				System.out.println("\nRemove o unico elemento");
                head = null;
                tail = null;
            } else {
                head = head.next;
			}
			p.next = null;
			size--;
		}

		return returnData;
	}

    @Override
    public E removeLast() throws Exception {
		E returnData = null;

        if (tail == null) {
            throw new Exception("A lista está vazia.");
        } else {
            returnData = tail.data;
            
            if (head == tail) {
            	System.out.println("\nRemove o unico elemento");
            	head = null;
            	tail = null;
            } else {
        		Node p = head;
                while (p.next != tail) {
                	p = p.next;
                }
                                
                tail = p;
                tail.next = null;
            }
            size--;
        }
        return returnData;
    }


    @Override
    public E remove(E criterion) throws Exception {
        Node previous = null;
		Node removed = null;

		if(head == null) {
            throw new Exception("A lista está vazia");
	    }

		previous = searchBefore(criterion);

		if(previous == null) {
			if(head.data.equals(criterion) == false) {
		        System.out.println("\nCritério não existe");
		        return null;
			} else {
				return removeFirst();
			}
		} else {
			removed = previous.next;

			if(removed == tail) {
				return removeLast();
			} else {
				previous.next = removed.next;
		        removed.next = null;
		        size--;
		        
				return removed.data;
			}
		}
    }


    private Node searchBefore(E criterio) {
	    Node p = head;
		Node previous = null;

	    while (p != null) {
	    	previous = p;
	        p = p.next;
	        
	        if (p != null && p.data.equals(criterio)) {
	           return previous;
	        }
	    }
	    return null;
	}


    @Override
	public void show() {
	    Node p = head;

		if(p == null) {
			System.out.println("\nA Lista está vazia");
		} else {
	        while(p != null) {
	            System.out.println("\nDado: " + p.data );
	            p = p.next;
	        }
	    }
		System.out.println("\nTamanho = " + size);
	}

    @Override
    public void showReverse() {
    	System.out.println("É uma lista simplesmente encadeada");
    	// É uma lista simplesmente encadeada
    }
}
