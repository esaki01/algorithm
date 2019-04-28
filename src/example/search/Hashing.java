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
package example.search;

public class Hashing {
    public static void main(String[] args) {
        int[] data = {12, 25, 36, 20, 30, 8, 42};
        int[] hashedData = store(data);
        int target = 36;
        search(hashedData, target);
    }

    private static void search(int[] hashedData, int target) {
        int k = hash(target);
        while (hashedData[k] != 0) {
            if (hashedData[k] == target) {
                System.out.printf("%d番目の要素に%dが格納されています.", k, target);
                return;
            }
            k = (k + 1) % 11;
        }
        System.out.printf("%dは見つかりませんでした.", target);
    }

    private static int[] store(int[] data) {
        int[] hashedData = new int[11];
        for (int i = 0; i < data.length; i++) {
            int k = hash(data[i]);
            if (hashedData[k] != 0) {
                k = (k + 1) % 11;
            }
            hashedData[k] = data[i];
        }
        return hashedData;
    }

    private static int hash(int value) {
        return value % 11;
    }
}
