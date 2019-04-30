/*
ハノイの塔.
 */
package recursion;

public class TowerOfHanoi {

    /**
     * no枚の円盤をx軸からy軸へ移動する.
     *
     * @param no 円盤の枚数
     * @param x 開始軸
     * @param y 目的軸
     * 6 - x - y 中間軸
     */
    public static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }

        System.out.printf("円盤[%d]を%d軸から%d軸へ移動\n", no, x, y);

        if (no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }
}
