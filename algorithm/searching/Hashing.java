/*
ハッシュ探索法.
あらかじめ関数を使ってデータを格納しておき、
格納するのに使った関数を使い、一発でデータを探索するアルゴリズム.

POINT
- データの格納先の添字を計算するにはハッシュ関数を使う
- 格納先の添字がバッティングすることを衝突（シノニム）という
- 衝突が起こったら、隣の空き要素にデータを格納する

ハッシュ探索法では以下2つのアルゴリズムが必要.
- ハッシュ関数でデータを格納するアルゴリズム
- ハッシュ関数でデータを探索するアルゴリズム
 */
package searching;

public class Hashing {

    public static int search(int[] hashData, int target) {
        int k = hash(target);
        while (hashData[k] != 0) {
            if (hashData[k] == target) {
                return k;
            }
            k = (k + 1) % 11;
        }
        return -1;
    }

    /**
     * データ配列をハッシュ化し、別のデータ配列に格納する.
     *
     * @param data 検索範囲のデータ配列
     * @return ハッシュ化された検索範囲のデータ配列
     */
    public static int[] store(int[] data) {
        int[] hashData = new int[11];
        for (int i = 0; i < data.length; i++) {
            int k = hash(data[i]);
            if (hashData[k] != 0) {
                k = (k + 1) % 11;
            }
            hashData[k] = data[i];
        }
        return hashData;
    }

    /**
     * データをハッシュ化する.
     *
     * @param value ハッシュ化したいデータ
     * @return ハッシュ化されたデータ
     */
    private static int hash(int value) {
        return value % 11;
    }
}
