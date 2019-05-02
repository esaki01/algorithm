/*
二分探索法（バイナリサーチ）.
あらかじめ昇順か降順に整列されているデータが対象.
探索する範囲を半分に絞りながら探索を進めるアルゴリズム.

POINT
二分探索法は主に3つの処理からなる.
- 真ん中の要素を選ぶ
- 真ん中のデータと目的のデータを比較する
- 探索の範囲を半分に狭める

配列の端（先頭）の添字が端（末尾）よりも大きくなった場合は、目的のデータは見つからなかったと言うことができる.
 */
package searching;

public class BinarySearch {

    public static int search(int[] data, int target) {
        int head = 0;
        int tail = data.length - 1;
        while (head <= tail) {
            int center = (head + tail) / 2;
            if (data[center] == target) {
                return center;
            } else if (data[center] < target) {
                head = center + 1;
            } else {
                tail = center - 1;
            }
        }
        return -1;
    }
}
