package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    private int[] data = {4, 2, 3, 5, 1};

    @Test
    void searchTest_TargetFound() {
        int target = 5;
        int expected = 3;

        LinearSearch linearSearch = new LinearSearch(data, target);
        int actual = linearSearch.search();

        assertEquals(expected, actual);
    }

    @Test
    void searchTest_TargetNotFound() {
        int target = 6;
        int expected = -1;

        LinearSearch linearSearch = new LinearSearch(data, target);
        int actual = linearSearch.search();

        assertEquals(expected, actual);
    }
}