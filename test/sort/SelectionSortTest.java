package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sortTest() {
        int[] data = {12, 13, 11, 14, 10};
        int[] expected = {10, 11, 12, 13, 14};

        SelectionSort selectionSort = new SelectionSort(data);
        selectionSort.sort();

        assertArrayEquals(expected, data);
    }
}