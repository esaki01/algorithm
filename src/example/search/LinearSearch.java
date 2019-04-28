/*
線形探索法（リニアサーチ）.
先頭から順番に調べて探す探索アルゴリズム.
 */
package example.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] data = {4, 2, 3, 5, 1};
        int target = 5;

        int index = search(data, target);
        if (index == -1) {
            System.out.printf("%dは見つかりませんでした.", target);
        } else {
            System.out.printf("%d番目の要素に%dが格納されています.", index, target);
        }
    }

    private static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}