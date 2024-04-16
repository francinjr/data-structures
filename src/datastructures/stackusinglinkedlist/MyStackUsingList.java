package datastructures.stackusinglinkedlist;

public class MyStackUsingList<E> implements MyStackInterface<E> {
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

	public MyStackUsingList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
		this.capacity = -1;
	}

	public MyStackUsingList(long capacity) {
		this.head = null;
		this.tail = null;
		this.size = 0;
		this.capacity = capacity;
	}

	@Override
	public void push(E data) throws MyStackException {
		Node newNode = new Node(data);

		if (isFull()) {
			throw new MyStackException("Vazia");
		}

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
	public E pop() throws MyStackException {
		Node p = head;
		E returnData = null;

		if (isEmpty()) {
			throw new MyStackException("Vazia");
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
	public E peek() throws MyStackException {
		if (head == null) {
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
			System.out.println("\nVazia");
		} else {
			while (p != null) {
				System.out.println("Dado: " + p.data);
				p = p.next;
			}
		}
		System.out.println("\nTamanho = " + size);
	}

	public long getSize() {
		return size;
	}

	public long getCapacity() {
		return capacity;
	}
}
