package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sortTest() {
        int[] data = {68, 22, 11, 32, 120, 5, 70};
        int[] expected = {5, 11, 22, 32, 68, 70, 120};

        MergeSort.sort(data);

        assertArrayEquals(expected, data);
    }
}