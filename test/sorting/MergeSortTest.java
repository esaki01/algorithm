package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort() {
        int[] data = {22, 5, 11, 32, 120, 68, 70};
        int[] expected = {5, 11, 22, 32, 68, 70, 120};

        MergeSort mergeSort = new MergeSort(data, 0, data.length - 1);
        mergeSort.sort();

        assertArrayEquals(expected, data);
    }
}