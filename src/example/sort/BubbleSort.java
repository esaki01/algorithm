/*
単純交換法（バブルソート）.
隣り合ったデータを交換する処理を繰り返して、全体を整列するアルゴリズム.

POINT
昇順に整列させる単純交換法は、2つの手順の組み合わせからなる.
- 右端の要素から順に、隣り合ったデータを昇順に並べ替える
  - 隣り合った要素のデータを比較する
  - 昇順に並べ替える
  - 1つ左の要素に移動する
- 左端の要素から1つずつ順番に、データを確定させていく
 */
package example.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {5, 3, 4, 1, 2};
        System.out.printf("ソート後のデータ：%s", Arrays.toString(sort(data)));
    }

    private static int[] sort(int[] data) {
        int k = 0;
        while (k < data.length - 1) {
            // 最小値を移動する処理
            int i = data.length - 1;
            while (i > k) {
                if (data[i - 1] > data[i]) {
                    // 入れ替える処理
                    int tmp = data[i - 1];
                    data[i - 1] = data[i];
                    data[i] = tmp;
                }
                i -= 1; // 1つ左の要素に移動する
            }
            k += 1; // データを確定
        }
        return data;
    }
}
