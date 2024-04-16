package datastructures.doublelinkedlist.main;

import datastructures.doublelinkedlist.MyDoubleLinkedList;
import datastructures.doublelinkedlist.MyLinkedListInterface;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Teste do addFirst
         * MyLinkedListInterface<Integer> numbers = new MySinglyLinkedList<>();
         * numbers.addFirst(5);
         * numbers.addFirst(10);
         * 
         * numbers.show();
         */

        // Teste do addLast
        /*
         * MyLinkedListInterface<Integer> numbers = new MySinglyLinkedList<>();
         * numbers.addLast(8);
         * numbers.addLast(15);
         * 
         * numbers.show();
         */

        // MyLinkedListInterface<Integer> numbers = new MySinglyLinkedList<>();
        // numbers.addAfter(8);
        // numbers.addAfter(15);

        // numbers.show();

        MyLinkedListInterface<Integer> numbers = new MyDoubleLinkedList<>();
        numbers.addLast(15);

        // numbers.show();
        Integer number = numbers.removeFirst();
        System.out.println("Elemento removido: " + number);
        numbers.addLast(38);
        Integer removedNumber = numbers.remove(38);
        System.out.println("O Elemento removido com o remove() é: " + removedNumber);

        // numbers.show();
    }
}
