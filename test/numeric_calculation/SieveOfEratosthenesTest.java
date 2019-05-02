package numeric_calculation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SieveOfEratosthenesTest {

    @Test
    void calculateTest() {
        int[] data = new int[101]; // 配列は素数を求めたい範囲＋1
        List<Integer> expected = Arrays.asList(
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

        List<Integer> actual = SieveOfEratosthenes.calculate(data);

        assertEquals(expected, actual);
    }
}