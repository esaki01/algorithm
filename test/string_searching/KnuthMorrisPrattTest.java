package string_searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnuthMorrisPrattTest {

    private String text = "ABC漢字DEF";

    @Test
    void searchTest_TargetFound() {
        String pattern = "漢字";
        int expected = 3;

        KnuthMorrisPratt kmp = new KnuthMorrisPratt(text, pattern);
        int actual = kmp.search();

        assertEquals(expected, actual);
    }

    @Test
    void searchTest_TargetNotFound() {
        String pattern = "漢方";
        int expected = -1;

        KnuthMorrisPratt kmp = new KnuthMorrisPratt(text, pattern);
        int actual = kmp.search();

        assertEquals(expected, actual);
    }
}