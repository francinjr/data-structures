package sortingalgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = { 5, 1, 4, 3, 6, 2 };
        System.out.println("Array desordenado: ");
        show(array);

        quickSort(array, 0, 5);

        System.out.println("Array ordenado: ");
        show(array);
    }

    public static void quickSort(int array[], int start, int end) {
        int i, j, pivot, temp;

        i = start;
        j = end;
        pivot = array[(start + end) / 2];

        while (i < j) {
            while (array[i] < pivot) {
                i = i + 1;
            }

            while (array[j] > pivot) {
                j = j - 1;
            }

            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i = i + 1;
                j = j - 1;
            }
        }

        if (j > start) {
            quickSort(array, start, j);
        }
        if (i < end) {
            quickSort(array, i, end);
        }
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
