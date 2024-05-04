package sortingalgorithms;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = { 8, 5, 7, 1, 9, 3 };
        System.out.println("Array desordenado: ");
        show(array);

        selectSort(array);

        System.out.println("Array ordenado: ");
        show(array);
    }

    public static void selectSort(int[] array) {
        int minor;
        int temp;
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            minor = i;
            for (int j = (i + 1); j < size; j++) {
                if (array[j] < array[minor]) {
                    minor = j;
                }
            }

            if (i != minor) {
                temp = array[i];
                array[i] = array[minor];
                array[minor] = temp;
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
