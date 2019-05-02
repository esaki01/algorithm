package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void sortTest() {
        int[] data = {7, 1, 3, 2, 8, 6, 4, 5};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        ShellSort.sort(data);

        assertArrayEquals(expected, data);
    }
}