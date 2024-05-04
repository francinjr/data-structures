package sortingalgorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = { 9, 7, 1, 5 };
        System.out.println("Array desordenado: ");
        show(array);

        bubbleSort(array);
        System.out.println("Array ordenado: ");
        show(array);
    }

    public static void bubbleSort(int[] array) {
        int temp;
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void show(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
