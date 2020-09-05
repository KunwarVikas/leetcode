package main.com.kv.datastructures.sorting;

/**
 * Merge Sort is a Divide and Conquer algorithm.
 * It divides the given input array in two halves, calls itself for the two halves and
 * then merges the two sorted halves. The merge() function is used for merging two halves.
 * The merge(inpurarr, l, m, r) is key process that assumes that inpurarr1[l..m] and inpurarr1[m+1..r]
 * are sorted and merges the two sorted sub-arrays into one.
 */
public class MergeSort {

    /**
     *
     * @param arr
     * @param left
     * @param middle
     * @param right
     */
    void merge(int arr[], int left, int middle, int right)
    {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        //temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[middle + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int left, int right)
    {
        if (left < right) {
            // Find the middle point
            int m = (left + right) / 2;

            // Sort first and second halves
            sort(arr, left, m);
            sort(arr, m + 1, right);

            // Merge the sorted halves
            merge(arr, left, m, right);
        }
    }

    /**
     * Print the array
     * @param arr
     */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     *
     * @param args
     */
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Array");
        printArray(arr);
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array");
        printArray(arr);
    }
}

