package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    private int[] data = {4, 2, 3, 5, 1};

    @Test
    void searchTest_TargetFound() {
        int target = 5;
        int expected = 3;

        int actual = LinearSearch.search(data, target);

        assertEquals(expected, actual);
    }

    @Test
    void searchTest_TargetNotFound() {
        int target = 6;
        int expected = -1;

        int actual = LinearSearch.search(data, target);

        assertEquals(expected, actual);
    }
}