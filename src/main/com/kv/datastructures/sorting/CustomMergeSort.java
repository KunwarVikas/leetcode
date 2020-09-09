package main.com.kv.datastructures.sorting;
import java.util.Arrays;

/**
 * Merge sort is a fast, stable sorting routine with guaranteed O(n*log(n)) efficiency.
 * When sorting arrays, merge sort requires additional space of same size of the input array.
 * It uses divide and conquer algorithm to achieve sorting.
 */
public class CustomMergeSort {
    public static void main(String args[]){
        int[] inputArray = {45,23,11,89,77,98,4,28,65,43};
        CustomMergeSort customMergeSort = new CustomMergeSort();
        customMergeSort.mergeSort(inputArray,inputArray.length);
        Arrays.stream(inputArray).forEach(i-> System.out.println(i+" "));
    }

     /**
     * Divide input array into multiple sub-arrays, sort them, and then merge sub-arrays in order to sort the
     * main input array. This entire functionality will be called recursively.
     * @param inputArr
     * @param len
     */
    public void mergeSort(int [] inputArr,int len) {
        if(len<2){
            return;
        }

        int mid = len/2;
        int [] left = new int[mid];
        int [] right = new int[len-mid];
        for (int i = 0; i < mid; i++) {
            left[i] = inputArr[i];
        }

        for (int i = mid; i < len; i++) {
            right[i - mid] = inputArr[i];
        }
        mergeSort(left, mid);
        mergeSort(right, len - mid);
        merge(inputArr, left, right, mid, len - mid);
    }

    /**
     *
     * @param inputArr
     * @param left
     * @param right
     * @param leftLen
     * @param rightLen
     */
    private void merge(int[] inputArr, int[] left, int[] right, int leftLen, int rightLen) {
        int i = 0, j = 0, k = 0;
        while (i < leftLen && j < rightLen) {
            if (left[i] <= right[j]) {
                inputArr[k++] = left[i++];
            }
            else {
                inputArr[k++] = right[j++];
            }
        }
        while (i < leftLen) {
            inputArr[k++] = left[i++];
        }
        while (j < rightLen) {
            inputArr[k++] = right[j++];
        }
    }
}
