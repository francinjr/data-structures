package searchalgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = { 2, 5, 9, 8 };

        int itemToSearch = 8;

        System.out.println("O índice do elemento " + itemToSearch + " é: "
                + linearSearch(itemToSearch, array));
    }

    public static int linearSearch(int key, int[] array) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
