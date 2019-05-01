package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void sortTest() {
        int[] data = {5, 3, 4, 1, 2};
        int[] expected = {1, 2, 3, 4, 5};

        InsertionSort insertionSort = new InsertionSort(data);
        insertionSort.sort();

        assertArrayEquals(expected, data);
    }
}