package sortingalgorithms;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = { 5, 1, 4, 3, 6, 2 };
        System.out.println("Array desordenado: ");
        show(array);

        insertSort(array);

        System.out.println("Array ordenado: ");
        show(array);
    }

    public static void insertSort(int[] array) {
        int j;
        int elementToInsert;
        int size = array.length;

        for (int i = 1; i < size; i++) {
            elementToInsert = array[i];

            j = i - 1;

            while ((j >= 0) && (elementToInsert < array[j])) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = elementToInsert;
        }
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
