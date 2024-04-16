package datastructures.queueusinglinkedlist;

public class MyQueueUsingList<E> implements MyQueueInterface<E> {
	class Node {
		E data;
		Node next;

		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;
	private long size;
	private long capacity;

	public MyQueueUsingList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
		this.capacity = -1;
	}

	public MyQueueUsingList(long capacity) {
		this.head = null;
		this.tail = null;
		this.size = 0;
		this.capacity = capacity;
	}

	public long getSize() {
		return size;
	}

	public long getCapacity() {
		return capacity;
	}

	@Override
	public void add(E data) throws MyQueueException {
		if (isFull()) {
			throw new MyQueueException("Cheia!");
		}

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	@Override
	public E remove() throws MyQueueException {
		Node p = head;
		E returnData = null;

		if (isEmpty()) {
			throw new MyQueueException("Vazia");
		} else {
			returnData = head.data;

			if (head == tail) {
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
	public E peek() throws MyQueueException {
		if (head == null) {
			System.out.println("\nVazia");
			return null;
		} else {
			return head.data;
		}
	}

	@Override
	public boolean isEmpty() {
		return (head == null);
	}

	@Override
	public boolean isFull() {
		if (capacity == -1) {
			return false;
		} else {
			if (size == capacity) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public void show() {
		Node p = head;

		if (p == null) {
			System.out.println("Vazia \n");
		} else {
			while (p != null) {
				System.out.println("Dado: " + p.data);
				p = p.next;
			}
		}
		System.out.println("Tamanho = " + size + "\n");
	}
}
