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
package sorting;

public class MergeSort {

    /** マージ結果を一時的に格納するための作業用配列. */
    private static int[] buff;

    public static void sort(int[] data, int left, int right) {
        buff = new int[data.length];

        mergeSort(data, left, right); // 配列全体をマージソート

        buff = null;
    }

    private static void mergeSort(int[] data, int left, int right) {
        if (left < right) {
            int i; // 配列dataのインデックス
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            mergeSort(data, left, center); // 前半部をマージソート
            mergeSort(data, center + 1, right); // 後半部をマージソート

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
