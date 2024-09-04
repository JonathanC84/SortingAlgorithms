package sorting_algorithms;

import sorting_algorithms.tools.Tools;

public class Bubble {

    // Tri à bullles (bubble sort)
    // O(n) -> O(n²)

   public static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            boolean isSorted = true;
            for (int j = 0; j < i; j++) {
                if (array[j + 1] < array[j]) {
                    Tools.swap(array[j], array[j + 1]);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}
