/*
エラトステネスの篩.
素数を見つけ出すアルゴリズム.

POINT
エラトステネスの篩は、大きく分けて3つの処理からなる.
- ある数以下の全整数データを用意する
- 平方根以下の素数の倍数を取り除く
- 最後まで残った数を素数として出力する
 */
package numeric_calculation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes {

    /**
     * 数値の配列から素数を見つけ出す.
     *
     * @param data データ配列
     * @return 素数のリスト
     */
    public static List<Integer> calculate(int[] data) {
        Arrays.fill(data, 1);

        // kがデータ数−1の平方根以下の間繰り返す
        for (int k = 2; k * k <= data.length - 1;) {
            // 素数kの倍数を取り除く
            for (int i = k; i <= (data.length - 1) / k;) {
                data[k * i] = 0;
                i++;
            }
            // kに次の素数を代入する
            do {
                k++;
            } while (data[k] == 0);
        }
        // 素数である添字をリストに格納し、返却する
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= data.length - 1; i++) {
            if (data[i] == 1) {
                list.add(i);
            }
        }
        return list;
    }
}
