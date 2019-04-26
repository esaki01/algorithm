/*
ユークリッドの互除法.
最大公約数を求めるアルゴリズム.
 */
package example.numeric_calculation;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int num1 = 221;
        int num2 = 143;
        int result = calculate(num1, num2);
        System.out.printf("%dと%dの最大公約数は%dです.", num1, num2, result);
    }

    private static int calculate(int num1, int num2) {
        int result = num1 % num2;
        if (result == 0) {
            return num2; // 割り切れれば、割るのに使った数が最大公約数
        }
        return calculate(num2, result);
    }
}
