package sortingalgorithms;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = { 5, 1, 4, 3, 6, 2 };

        System.out.println("Array desordenado: ");
        show(array);

        shellSort(array);

        System.out.println("Array ordenado: ");
        show(array);
    }

    public static void shellSort(int[] array) {
        int i, j, value;
        int h = 1;
        int size = array.length;

        while (h < size) {
            h = 3 * h + 1;
        }

        while (h > 0) {
            for (i = h; i < size; i++) {
                value = array[i];
                j = i;

                while (j > h - 1 && value <= array[j - h]) {
                    array[j] = array[j - h];
                    j = j - h;
                }
                array[j] = value;
            }

            h = h / 3;
        }
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
