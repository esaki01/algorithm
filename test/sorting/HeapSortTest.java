package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    @Test
    void sort() {
        int[] data = {22, 5, 11, 32, 120, 68, 70};
        int[] expected = {5, 11, 22, 32, 68, 70, 120};

        HeapSort heapSort = new HeapSort(data);
        heapSort.sort();

        assertArrayEquals(expected, data);
    }
}