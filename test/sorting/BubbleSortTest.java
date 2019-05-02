package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sortTest() {
        int[] data = {5, 3, 4, 1, 2};
        int[] expected = {1, 2, 3, 4, 5};

        BubbleSort.sort(data);

        assertArrayEquals(expected, data);
    }
}