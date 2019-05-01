package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashingTest {

    private int[] data = {12, 25, 36, 20, 30, 8, 42};

    @Test
    void searchTest_TargetFound() {
        int target = 36;
        int expected = 4;

        Hashing hashing = new Hashing(data, target);
        int actual = hashing.search();

        assertEquals(expected, actual);
    }

    @Test
    void searchTest_TargetNotFound() {
        int target = 37;
        int expected = -1;

        Hashing hashing = new Hashing(data, target);
        int actual = hashing.search();

        assertEquals(expected, actual);
    }
}