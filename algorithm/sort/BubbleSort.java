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
package sort;

import sort.abstract_object.AbstractSort;

public class BubbleSort extends AbstractSort {

    BubbleSort(int[] data) {
        super(data);
    }

    @Override
    public void sort() {
        for (int k = 0; k < data.length - 1; k++) {
            // 最小値を左端に移動する処理
            for (int i = data.length - 1; i > k; i--) {
                if (data[i - 1] > data[i]) {
                    // 昇順になっていなければ入れ替える
                    int tmp = data[i - 1];
                    data[i - 1] = data[i];
                    data[i] = tmp;
                }
            }
            // 左端の要素が1つ確定
        }
    }

    public void sort2() {
        for (int k = 0; k < data.length - 1; k++) {
            // 最小値を左端に移動する処理
            int exchange = 0; // 交換回数
            for (int i = data.length - 1; i > k; i--) {
                if (data[i - 1] > data[i]) {
                    // 昇順になっていなければ入れ替える
                    int tmp = data[i - 1];
                    data[i - 1] = data[i];
                    data[i] = tmp;

                    exchange++;
                }
            } // 左端の要素が1つ確定
            if (exchange == 0) { // 交換が行われなかったら終了
                break;
            }
        }
    }
}
