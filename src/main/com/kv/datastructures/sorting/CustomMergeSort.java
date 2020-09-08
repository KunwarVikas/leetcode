package main.com.kv.datastructures.sorting;
import java.util.Arrays;

/**
 * Merge sort is a fast, stable sorting routine with guaranteed O(n*log(n)) efficiency.
 * When sorting arrays, merge sort requires additional space of same size of the input array.
 * It uses divide and conquer algorithm to achieve sorting.
 */
public class CustomMergeSort {
    private int[] array;
    private int[] tempMergeSortArray;
    private int length;

    /**
     * main method
     * @param a
     */
    public static void main(String a[]){
        int[] inputArray = {45,23,11,89,77,98,4,28,65,43};
        CustomMergeSort customMergeSort = new CustomMergeSort();
        customMergeSort.sort(inputArray);
        Arrays.stream(inputArray).forEach(i-> System.out.println(i+" "));
    }

    public void sort(int inputArray[]) {
        this.array = inputArray;
        this.length = inputArray.length;
        this.tempMergeSortArray = new int[length];
        mergeSort(0, length - 1);
    }

    /**
     * Divide input array into multiple sub-arrays, sort them, and then merge sub-arrays in order to sort the
     * main input array. This entire functionality will be called recursively.
     * @param low
     * @param high
     */
    private void mergeSort(int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2; //avoid out of bound exception
            // recursive calls to sort left and right sub-arrays
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            // This method will merge the sub-arrays
            mergeSubArrays(low, mid, high);
        }
    }

    /**
     * Merge sub-arrays.
     * @param low
     * @param mid
     * @param high
     */
    private void mergeSubArrays(int low, int mid, int high) {

        for (int i = low; i <= high; i++) {
            tempMergeSortArray[i] = array[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (tempMergeSortArray[i] <= tempMergeSortArray[j]) {
                array[k] = tempMergeSortArray[i];
                i++;
            } else {
                array[k] = tempMergeSortArray[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            array[k] = tempMergeSortArray[i];
            k++;
            i++;
        }
    }
}
