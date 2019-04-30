/*
単純挿入法（挿入ソート）.
正しい順序になるようにデータを挿入していき、並べ替える整列アルゴリズム.

POINT
単純挿入法は、次の手順からできている.
- 挿入したいデータを、整列済みデータと順番に比較していく
- 挿入したいデータより小さいデータが見つかったら、その後ろの要素に挿入する
 */
package sort;

import sort.base.BaseSort;

public class InsertionSort extends BaseSort {

    InsertionSort(int[] data) {
        super(data);
    }

    @Override
    public void sort() {
        for (int i = 1; i < data.length; i++) {
            // 1つのデータを正しい位置に挿入する処理
            int tmp = data[i]; // 挿入するデータをtmpに代入
            int k; // 挿入するデータの添字をkに代入
            for (k = i; k > 0 && data[k - 1] > tmp; k--) {
                data[k] = data[k - 1]; // 挿入したいデータより大きいデータを後ろの要素に移動する（data[k - 1]が空く）
            }
            data[k] = tmp; // 空いた要素にデータを挿入する
        }
    }
}
