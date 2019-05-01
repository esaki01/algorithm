package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private int[] data = {11, 13, 17, 19, 23, 29, 31};

    @Test
    void searchTest_TargetFound() {
        int target = 17;
        int expected = 2;

        BinarySearch binarySearch = new BinarySearch(data, target);
        int actual = binarySearch.search();

        assertEquals(expected, actual);
    }

    @Test
    void searchTest_TargetNotFound() {
        int target = 18;
        int expected = -1;

        BinarySearch binarySearch = new BinarySearch(data, target);
        int actual = binarySearch.search();

        assertEquals(expected, actual);
    }
}