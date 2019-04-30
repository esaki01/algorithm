package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiTest {

    @Test
    void moveTest() {
        int no = 3;
        System.out.printf("ハノイの塔\n円盤の枚数：%d\n", no);
        TowerOfHanoi.move(no, 1, 3);
    }
}