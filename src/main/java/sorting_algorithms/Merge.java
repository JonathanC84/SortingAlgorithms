package sorting_algorithms;

public class Merge {

    // Tri fusion (merge sort)
    // O(n log n) -> O(n log n)

    public static void sort(int[] array) {
        mergeSort(array, array.length);
    }

    private static void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            rightArray[i - mid] = array[i];
        }
        mergeSort(leftArray, mid);
        mergeSort(rightArray, length - mid);

        merge(array, leftArray, rightArray, mid, length - mid);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            }
            else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }
    }
}
