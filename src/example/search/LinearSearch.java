/*
線形探索法（リニアサーチ）.
先頭から順番に調べて探す探索アルゴリズム.
 */
package example.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] data = {4, 2, 3, 5, 1};
        int target = 5;
        search(data, target);
    }

    private static void search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                System.out.printf("%d番目の要素に%dが格納されています.", i, target);
                return;
            }
        }
        System.out.printf("%dは見つかりませんでした.", target);
    }
}