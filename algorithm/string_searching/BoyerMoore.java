/*
Boyer-Moore法（BM法）.
理論的にも実践的にもKMP法より優れたアルゴリズム.
パターンの末尾文字から先頭側へと照合を行う過程で不一致文字を見つけた場合に、
事前に用意した表に基づいてパターンの移動量を決定する.
 */
package string_searching;

public class BoyerMoore {

    public static int search(String text, String pattern) {
        int pt; // textを照合する位置
        int pp; // patternを照合する位置
        int textLen = text.length(); // textの文字数
        int patternLen = pattern.length(); // patternの文字数
        int[] skip = new int[Character.MAX_VALUE + 1]; // スキップテーブル

        // スキップテーブルの作成
        for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
            skip[pt] = patternLen;
        }
        for (pt = 0; pt < patternLen - 1; pt++) {
            skip[pattern.charAt(pt)] = patternLen - pt - 1; // pt == patternLen - 1である
        }

        // 探索
        while (pt < textLen) {
            pp = patternLen - 1; // patternの末尾文字に着目
            while (text.charAt(pt) == pattern.charAt(pp)) {
                if (pp == 0) {
                    return pt; // 探索成功
                }
                pp--;
                pt--;
            }
            pt += (skip[text.charAt(pt)] > patternLen - pp) ? skip[text.charAt(pt)] : patternLen - pp;
        }
        return -1; // 探索失敗
    }
}
