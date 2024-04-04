package datastructures.doublelinkedlist;

public class MyDoubleLinkedList<E> implements MyLinkedListInterface<E> {

	class Node {
		private Node next;
		private Node prev;
		private E data;

		public Node(E data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}

	private Node head;
	private Node tail;
	private int size;

	public MyDoubleLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public void addFirst(E dado) {
		Node newNode = new Node(dado);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}

	@Override
	public void addLast(E data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	@Override
	public boolean addAfter(E data, E criterion) throws Exception {
		Node p = searchNode(criterion);

		if (p == null) {
			System.out.println("Criterio invalido \n");
			return false;
		} else {
			Node newNode = new Node(data);

			if (p.next == null) {
				tail = newNode;
			}

			newNode.next = p.next;
			newNode.prev = p;
			p.next = newNode;

			Node front = newNode.next;
			if (front != null) {
				front.prev = newNode;
			}
			size++;

			return true;
		}
	}

	public Node searchNode(E criterion) {
		Node p = head;

		while (p != null) {
			if (p.data.equals(criterion)) {
				return p;
			}
			p = p.next;
		}
		return null;
	}

	@Override
	public E peekFirst() throws Exception {
		if (head == null) {
			throw new Exception("A lista está vázia");
		}
		return head.data;
	}

	@Override
	public E peekLast() throws Exception {
		if (tail == null) {
			throw new Exception("A lista está vázia");
		}
		return tail.data;
	}

	@Override
	public E search(E criterion) throws Exception {
		Node p = searchNode(criterion);

		if (p == null) {
			return null;
		}
		return p.data;
	}

	@Override
	public E removeFirst() throws Exception {
		Node p = head;
		E returnData = null;

		if (head == null) {
			System.out.println("\n A lista está vázia");
		} else {
			returnData = p.data;

			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				head.prev = null;
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
			System.out.println("Lista Vazia!!! \n");
			return null;
		} else {
			returnData = tail.data;

			if (head == tail) {
				head = null;
				tail = null;
			} else {
				Node previous = tail.prev;
				tail.prev = null;
				tail = previous;
				tail.next = null;
			}

			size--;
		}
		return returnData;
	}

	@Override
	public E remove(E criterion) throws Exception {
		E returnData = null;

		if (head == null) {
			System.out.println("Lista Vazia!!! \n");
			return null;
		}

		Node previous = null;
		Node removed = searchNode(criterion);
		if (removed != null) {
			previous = removed.prev;
		}

		if (previous == null) {
			if (head.data.equals(criterion) == false) {
				System.out.println("criterio nao existe!!! \n");
				return null;
			} else {
				return removeFirst();
			}
		} else {
			System.out.println("\nRemove o elemento do meio ou ultimo");

			if (removed == tail) {
				return removeLast();
			} else {
				System.out.println("Remove meio \n");
				Node frente = removed.next;

				previous.next = frente;
				frente.prev = previous;

				removed.next = null;
				removed.prev = null;

				size--;

				returnData = removed.data;
				return returnData;
			}
		}
	}

	
	@Override
	public void show() {
		Node p = head;

		if (p == null) {
			System.out.println("\nA lista está vázia");
		} else {
			while (p != null) {
				System.out.println("\nDado: " + p.data);
				p = p.next;
			}
		}

		System.out.println("\nTamanho = " + size);
	}

	
	@Override
	public void showReverse() {
		Node p = tail;

		if (p == null) {
			System.out.println("\nA lista está vázia");
		} else {
			while (p != null) {
				System.out.println("\n Dado: " + p.data);
				p = p.prev;
			}
		}
		System.out.println("\nTamanho = " + size);
	}

}
