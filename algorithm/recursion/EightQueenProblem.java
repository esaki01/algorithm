/*
8王妃問題.
王妃が行方向と列方向と斜め方向に重複しない組み合わせを列挙する.
 */
package recursion;

public class EightQueenProblem {

    /** 各行に王妃が配置済みか. */
    private static boolean[] flag_a = new boolean[8];

    /** ／対角線に王妃が配置済みか. */
    private static boolean[] flag_b = new boolean[15];

    /** ＼対角線に王妃が配置済みか. */
    private static boolean[] flag_c = new boolean[15];

    /** 各列の王妃の位置. */
    private static int[] pos = new int[8];

    /**
     * i列目の適切な位置に王妃を配置
     * @param i 列番号
     */
    public static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (!flag_a[j] && // 横（j行）に未配置
                    !flag_b[i + j] && // ／対角線に未配置
                    !flag_c[i - j + 7]) {  // ＼対角線に未配置
                pos[i] = j;

                if (i == 7) {
                    print();
                } else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }
    }

    /**
     * 盤面（各列の王妃の位置）を出力
     */
    private static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }
}
