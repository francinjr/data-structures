package datastructures.queueusingarray.main;

import datastructures.queueusingarray.MyQueueInterface;
import datastructures.queueusingarray.MyQueueUsingArray;

public class Main {
	public static void main(String[] args) {
		// Uma demonstração do uso da Fila
		int returnedValue;

		MyQueueInterface<Integer> queue1 = new MyQueueUsingArray<Integer>(3);

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
