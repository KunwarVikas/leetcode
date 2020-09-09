package test.com.kv.datastructures.sorting;

import main.com.kv.datastructures.sorting.CustomMergeSort;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    private CustomMergeSort customMergeSort;

    @Before
    public void setup(){
        customMergeSort = new CustomMergeSort();
    }

    @Test
    public void test_merge_sort() {
        int[] actual = { 51, 15, 61, 25, 33, 42,87 };
        int[] expected = { 15, 25, 33, 42, 51, 61,87 };
        customMergeSort.mergeSort(actual,actual.length);
        assertArrayEquals(expected, actual);
    }
}
