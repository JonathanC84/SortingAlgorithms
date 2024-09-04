package sorting_algorithms;

import sorting_algorithms.tools.Tools;

public class Selection {

    // Tri par sélection (selection sort)
    // O(n²) -> O(n²)

    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                Tools.swap(array[i], array[min]);
            }
        }
    }
}
