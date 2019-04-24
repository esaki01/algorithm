/*
クイックソート.
データを大小のグループ2つに分割しながら全体を整列していくアルゴリズム.
実行速度が速いのが特徴. 大量のデータを整列する際によく利用される.

POINT
クイックソートは、大きく分けて2つの処理から構成されている.
- 基準値を境にして、データを大小に分ける処理
- 分けたデータに対して繰り返し同じ処理を実行する
 */
package example.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] data = {5, 4, 7, 6, 8, 3, 1, 2, 9};
        System.out.printf("ソート後のデータ：%s", Arrays.toString(sort(data, 0, data.length - 1)));
    }

    private static int[] sort(int[] data, int left, int right) {
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
            sort(data, left, k - 1);
        }
        if (k + 1 < right) {
            sort(data, k + 1, right);
        }
        return data;
    }
}
