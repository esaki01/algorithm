/*
単純挿入法（挿入ソート）.
正しい順序になるようにデータを挿入していき、並べ替える整列アルゴリズム.

POINT
単純挿入法は、次の手順からできている.
- 挿入したいデータを、整列済みデータと順番に比較していく
- 挿入したいデータより小さいデータが見つかったら、その後ろの要素に挿入する
 */
package example.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {5, 3, 4, 1, 2};
        System.out.printf("ソート後のデータ：%s", Arrays.toString(sort(data)));
    }

    private static int[] sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            // 1つのデータを正しい位置に挿入する処理
            int tmp = data[i]; // 挿入するデータをtmpに代入
            int k = i; // 挿入するデータの添字をkに代入
            while (k > 0 && data[k - 1] > tmp) {
                data[k] = data[k - 1]; // 挿入したいデータより大きいデータを後ろの要素に移動する（data[k - 1]が空く）
                k -= 1;
            }
            data[k] = tmp; // 空いた要素にデータを挿入する
        }
        return data;
    }
}
