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

import java.util.Arrays;

public class MergeSort {

    /** マージ結果を一時的に格納するための作業用配列. */
    private static int[] tmp = null;

    public static void sort(int[] data) {
        tmp = new int[data.length];
        sort(data, 0, data.length - 1); // 配列全体をソート
    }

    private static void sort(int[] data, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            int t1 = 0; // 配列tmpのカウンター1
            int t2 = 0; // 配列tmpのカウンター2
            int d1 = left; // 配列dataのカウンター1
            int d2 = left; // 配列dataのカウンター2

            System.out.printf("----- data[%d] ~ data[%d]をdata[%d]を境に分解 -----\n\n", left, right, center);

            sort(data, left, center); // 前半部をソート
            sort(data, center + 1, right); // 後半部をソート

            System.out.printf("----- 前半部（data[%d] ~ data[%d]）と後半部（data[%d] ~ data[%d]）をマージ -----\n", left, center, center + 1, right);
            System.out.printf("マージ前の配列dataの中身：%s\n", Arrays.toString(data));

            // 配列dataの前半部data[left] ~ data[center]を配列tmpのtmp[0]~tmp[center - left]にコピー
            while (d1 <= center) {
                tmp[t1] = data[d1];
                t1++;
                d1++;
            }

            // 配列dataの後半部と配列tmp（配列dataの前半部）をマージした結果を配列dataに格納
            while (d1 <= right && t2 < t1) {
                if (tmp[t2] <= data[d1]) { // 配列tmp（配列dataの前半部）と配列dataの後半部の着目要素のうち、小さい方の値を配列dataに格納
                    data[d2] = tmp[t2];
                    t2++;
                } else {
                    data[d2] = data[d1];
                    d1++;
                }
                d2++;
            }

            // 配列tmpに残った未格納要素を配列dataにコピー
            // 前のループで配列dataのカーソル（d1）がrightまで進んで終了すると、配列tmpに未格納要素が残る可能性がある
            while (t2 < t1) {
                data[d2] = tmp[t2];
                t2++;
                d2++;
            }

            System.out.printf("マージ後の配列dataの中身：%s\n\n", Arrays.toString(data));
        }
    }
}
