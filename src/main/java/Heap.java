public class Heap {

    // Tri par tas (heap sort)
    // O(n log n) -> O(n log n)

    public static void sort(int [] array) {
        int length = array.length;
        for (int i = length / 2; i >= 0 ; i--) {
            sink(array, i, length);
        }
        for (int i = length - 1; i > 0; i--) {
            Swap.swap(array[i], array[0]);
            sink(array, 0, i - 1);
        }
    }

    private static void sink(int [] array, int index, int length) {
        int j = 2 * index;
        while (j < length) {
            if ((array[j] < array[j+1])) {
                j = j + 1;
            }
            if (array[index] < array[j]) {
                Swap.swap(array[index], array[j]);
                index = j;
                j = 2 * index;
            } else {
                j = length + 1;
            }
        }
    }
}
