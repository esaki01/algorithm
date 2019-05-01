package string_searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BruteForceSearchTest {

    private String text = "ABC漢字DEF";

    @Test
    void searchTest_TargetFound() {
        String pattern = "漢字";
        int expected = 3;

        BruteForceSearch bruteForceSearch = new BruteForceSearch(text, pattern);
        int actual = bruteForceSearch.search();

        assertEquals(expected, actual);
    }

    @Test
    void searchTest_TargetNotFound() {
        String pattern = "漢方";
        int expected = -1;

        BruteForceSearch bruteForceSearch = new BruteForceSearch(text, pattern);
        int actual = bruteForceSearch.search();

        assertEquals(expected, actual);
    }
}