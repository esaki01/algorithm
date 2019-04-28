/*
ハノイの塔.
 */
package example.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int no = 3;
        System.out.printf("ハノイの塔\n円盤の枚数：%d\n", no);
        move(no, 1, 3);
    }

    /**
     * no枚の円盤をx軸からy軸へ移動する.
     *
     * @param no 円盤の枚数
     * @param x 開始軸
     * @param y 目的軸
     * 6 - x - y 中間軸
     */
    private static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }

        System.out.printf("円盤[%d]を%d軸から%d軸へ移動\n", no, x, y);

        if (no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }
}
