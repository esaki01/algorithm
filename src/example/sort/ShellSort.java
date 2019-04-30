/*
シェルソート.
単純挿入ソートの長所を生かしたまま、その短所を補うことで、高速なソートをするアルゴリズム.

POINT
単純挿入ソートには以下の特徴があります.
- ソート済みあるいは、それに近い状態では高速である（メリット）
- 挿入先が遠く離れている場合は、移植（代入）回数が多くなる（デメリット）

シェルソートは、大きく分けて2つの処理から構成されている.
- 離れた要素をグループ化して大まかなソートを行う
- グループを縮小しながらソートを繰り返す
 */
package example.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] data = {7, 1, 3, 2, 8, 6, 4, 5};
        System.out.printf("ソート後のデータ：%s", Arrays.toString(sort(data)));
    }

    private static int[] sort(int[] data) {
        int h;
        for (h = 1; h < data.length / 9; h = h * 3 + 1) {} // hの初期値を求める（「data.length / 9」を超えない最大値）.

        for (; h > 0; h /= 3) { // グループを縮小する
            for (int i = h; i < data.length; i++) {
                int tmp = data[i];
                int k;
                for (k = i - h; k >= 0 && data[k] > tmp; k -= h) { // 離れた要素をグループ化して大まかなソートを行う
                    data[k + h] = data[k];
                }
                data[k + h] = tmp;
            }
        }
        return data;
    }
}
