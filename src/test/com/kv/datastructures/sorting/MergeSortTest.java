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
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        customMergeSort.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
