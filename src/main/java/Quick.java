public class Quick {

    // Tri rapide (quick sort)
    // O(n²) -> O(n log n)

    public static void sort(int [] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int first, int last) {
        if (first < last) {
            int p = partition(array, first, last);
            // recursive call for left partition
            quickSort(array, first, p - 1);
            // recursive call for right partition
            quickSort(array, p + 1, last);
        }
    }

    private static int partition(int[] array, int first, int last) {
        int pivot = array[last];
        int pIndex = first;
        for (int i = first; i < last ; i++) {
            if (array[i] < pivot) {
                Swap.swap(array[i], array[pIndex]);
                pIndex++;
            }
        }

        int temp = array[last];
        array[last] = array[pIndex];
        array[pIndex] = temp;

        return pIndex;
    }
}
