package sorting_algorithms;

public class Insertion {

    // Tri par insertion (insertion sort)
    // O(n) -> O(n²)

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > x) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = x;
        }
    }
}
