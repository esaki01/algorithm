/*
ユークリッドの互除法.
最大公約数を求めるアルゴリズム.
 */
package numeric_calculation;

public class EuclideanAlgorithm {

    /**
     * 2つの数値の最大公約数を求める.
     *
     * @param num1 最大公約数を求めたい数値1つ目
     * @param num2 最大公約数を求めたい数値2つ目
     * @return 最大公約数
     */
    public static int calculate(int num1, int num2) {
        int result = num1 % num2;
        if (result == 0) {
            return num2; // 割り切れれば、割るのに使った数が最大公約数
        }
        return calculate(num2, result);
    }
}
