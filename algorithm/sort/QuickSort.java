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

    private int left;
    private int right;

    QuickSort(int[] data, int left, int right) {
        super(data);
        this.left = left;
        this.right = right;
    }

    @Override
    public void sort() {
        sort(left, right);
    }

    private void sort(int left, int right) {
        // 基準値を境にして、データを大小に分ける処理
        int i = left + 1;
        int k = right;
        while (i < k) {
            while (data[i] < data[left] && i < right) {
                i++;
            }
            while (data[k] >= data[left] && k > left) {
                k--;
            }
            if (i < k) {
                int tmp = data[i];
                data[i] = data[k];
                data[k] = tmp;
            }
        }
        if (data[left] > data[k]) {
            int tmp = data[left];
            data[left] = data[k];
            data[k] = tmp;
        }
        // 分けたデータに対して繰り返し同じ処理を実行する処理
        if (left < k - 1) {
            sort(left, k - 1);
        }
        if (k + 1 < right) {
            sort(k + 1, right);
        }
    }
}
