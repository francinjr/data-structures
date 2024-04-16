package datastructures.queueusinglinkedlist.main;

import datastructures.queueusinglinkedlist.MyQueueInterface;
import datastructures.queueusinglinkedlist.MyQueueUsingList;

public class Main {
	public static void main(String[] args) {
		// Uma demonstração do uso da Fila
		int returnedValue;

		MyQueueInterface<Integer> queue1 = new MyQueueUsingList<Integer>(3);

		queue1.add(3);
		queue1.add(5);
		queue1.add(7);

		returnedValue = queue1.peek();
		System.out.println("primeiro elemento = " + returnedValue);

		queue1.show();

		returnedValue = queue1.remove();
		System.out.println("removido = " + returnedValue);

		returnedValue = queue1.remove();
		System.out.println("removido = " + returnedValue);

		returnedValue = queue1.remove();
		System.out.println("removido = " + returnedValue);

		queue1.show();

		System.out.println("A fila está cheia? " + queue1.isFull());

		System.out.println("A fila está vázia? " + queue1.isEmpty());
	}
}
