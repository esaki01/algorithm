/*
単純選択法（選択ソート）.
一番小さなデータを選択して、先頭から順に並べ替えていくアルゴリズム.

POINT
昇順に整列する単純選択法は、次の2つの手順からできている.
- 探索範囲の最小値を探す処理
- 探索範囲の最小値を先頭要素と交換する処理
 */
package example.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {12, 13, 11, 14, 10};
        System.out.printf("ソート後のデータ：%s", Arrays.toString(sort(data)));
    }

    private static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            // 最小値を探す処理
            int indexMin = i;
            for (int k = i + 1; k < data.length; k++) {
                if (data[k] < data[indexMin]) {
                    indexMin = k;
                }
            }
            // 入れ替える処理
            int tmp = data[i]; // 先頭の要素のデータをtmpに代入する
            data[i] = data[indexMin]; // 最小値が入っている要素のデータを先頭の要素に代入する
            data[indexMin] = tmp; // 先頭の要素のデータを最小値が入っている要素に代入する
        }
        return data;
    }
}
