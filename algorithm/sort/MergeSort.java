/*
マージソート.
整列していない配列を2つに分割して、それぞれを整列させた後、
それらをマージして整列済みのひとつの配列を作るアルゴリズム.

POINT
マージソートは、次の手順からできている.
- 整列されていない配列を2つに分割する
- 配列を整列する
- 2つの配列をマージしてひとつの整列済み配列にする
 */
package sort;

import sort.abstract_object.AbstractSort;

public class MergeSort extends AbstractSort {

    /** マージ結果を一時的に格納するための作業用配列. */
    private int[] buff;

    /** 左端の要素のインデックス. */
    private int left;

    /** 右端の要素のインデックス. */
    private int right;

    MergeSort(int[] data, int left, int right) {
        super(data);
        this.left = left;
        this.right = right;
        this.buff = new int[data.length];
    }

    @Override
    public void sort() {
        sort(left, right); // 配列全体をマージソート
    }

    private void sort(int left, int right) {
        if (left < right) {
            int i; // 配列dataのインデックス
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            sort(left, center); // 前半部をマージソート
            sort(center + 1, right); // 後半部をマージソート

            //--- マージする ---//
            // 配列dataの前半部を配列buffにコピーする
            for (i = left; i <= center; i++) {
                buff[p++] = data[i];
            }
            // 配列の後半部とbuff配列にコピーした配列の前半部のp個をマージした結果を配列dataに格納する
            while (i <= right && j < p) {
                data[k++] = (buff[j] <= data[i]) ? buff[j++] : data[i++];
            }
            // 配列buffに残った未格納部分の要素を配列dataにコピーする
            while (j < p) {
                data[k++] = buff[j++];
            }
        }
    }
}
