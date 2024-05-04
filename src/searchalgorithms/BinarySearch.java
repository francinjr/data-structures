package searchalgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 2, 5, 8, 9, 12, 15 };

        int itemToSearch = 8;

        System.out.println("O índice do elemento " + itemToSearch + " é: "
                + binarySearch(itemToSearch, array));
    }

    public static int binarySearch(int key, int[] array) {
        int arraySize = array.length;
        int start = 0;
        int end = arraySize - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            if (key < array[mid]) {
                end = mid - 1;
            } else {
                if (key > array[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
