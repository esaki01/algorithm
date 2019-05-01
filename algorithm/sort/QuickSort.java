/*
クイックソート.
データを大小のグループ2つに分割しながら全体を整列していくアルゴリズム.
実行速度が速いのが特徴. 大量のデータを整列する際によく利用される.

POINT
クイックソートは、大きく分けて2つの処理から構成されている.
- 基準値を境にして、データを大小に分ける処理
- 分けたデータに対して繰り返し同じ処理を実行する
 */
package sort;

import sort.abstract_object.AbstractSort;

public class QuickSort extends AbstractSort {

    /** 左端の要素のインデックス. */
    private int left;

    /** 左端の要素のインデックス. */
    private int right;

    QuickSort(int[] data, int left, int right) {
        super(data);
        this.left = left;
        this.right = right;
    }

    @Override
    public void sort() {
        sort(left, right);
        for (int i : data) {
            System.out.println(i);
        }
    }

    private void sort(int left, int right) {
        // 基準値を境にして、データを大小に分ける処理
        int pl = left; // 左カーソル
        int pr = right; // 右カーソル
        int pivot = data[(pl + pr) / 2]; // 枢軸（中央の要素）

        while (pl <= pr) {
            while (data[pl] < pivot && pl < right) {
                pl++; // 枢軸より大きい値を探す
            }
            while (data[pr] > pivot && pr > left) {
                pr--; // 枢軸より小さい値を探す
            }
            if (pl <= pr) {
                int tmp = data[pl];
                data[pl] = data[pr];
                data[pr] = tmp;

                pl++;
                pr--;
            }
        } // plとprが交差すれば終了

        // 分けたデータに対して繰り返し同じ処理を実行する処理
        if (left < pr) {
            sort(left, pr);
        }
        if (pl < right) {
            sort(pl, right);
        }
    }
}
