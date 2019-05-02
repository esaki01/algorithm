package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sortTest() {
        int[] data = {22, 5, 11, 32, 120, 68, 70};
        int[] expected = {5, 11, 22, 32, 68, 70, 120};

        MergeSort.sort(data, 0, data.length - 1);

        assertArrayEquals(expected, data);
    }
}