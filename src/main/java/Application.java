import sorting_algorithms.*;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        int [] initialArray = { 3, 12, 7, 2, 5, 9, 8, 6, 11, 4, 1, 10 };
        System.out.println("**********************************");
        System.out.println("Initial array: " + Arrays.toString(initialArray));
        System.out.println("**********************************");
        System.out.println();

        System.out.println("sorting_algorithms.Insertion sort");
        int[] insertionArray = initialArray;
        Insertion.sort(insertionArray);
        System.out.println(Arrays.toString(insertionArray));
        System.out.println();

        System.out.println("sorting_algorithms.Bubble sort");
        int [] bubbleArray = initialArray;
        Bubble.sort(bubbleArray);
        System.out.println(Arrays.toString(bubbleArray));
        System.out.println();

        System.out.println("sorting_algorithms.Selection sort");
        int [] selectionArray = initialArray;
        Selection.sort(selectionArray);
        System.out.println(Arrays.toString(selectionArray));
        System.out.println();

        System.out.println("sorting_algorithms.Quick sort");
        int [] quickArray = initialArray;
        Quick.sort(quickArray);
        System.out.println(Arrays.toString(quickArray));
        System.out.println();

        System.out.println("sorting_algorithms.Heap sort");
        int [] heapArray = initialArray;
        Heap.sort(heapArray);
        System.out.println(Arrays.toString(heapArray));
        System.out.println();

        System.out.println("sorting_algorithms.Merge sort");
        int [] mergeArray = initialArray;
        Merge.sort(mergeArray);
        System.out.println(Arrays.toString(mergeArray));
        System.out.println();

    }
}
