package numeric_calculation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuclideanAlgorithmTest {

    @Test
    void calculateTest() {
        int expected = 13;
        int actual = EuclideanAlgorithm.calculate(221, 143);

        assertEquals(expected, actual);
    }
}