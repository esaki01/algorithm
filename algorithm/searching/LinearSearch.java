/*
線形探索法（リニアサーチ）.
先頭から順番に調べて探す探索アルゴリズム.
 */
package searching;

public class LinearSearch {

    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}