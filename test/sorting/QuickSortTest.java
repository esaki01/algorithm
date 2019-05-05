package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sortTest() {
        int[] data = {5, 4, 7, 6, 8, 3, 1, 2, 9};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        QuickSort.sort(data);

        assertArrayEquals(expected, data);
    }
}