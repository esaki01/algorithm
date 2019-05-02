/*
力まかせ探索.
文字列（テキスト）と探索文字列（パターン）を一文字ずつ比較する探索アルゴリズム.
 */
package string_searching;

public class BruteForceSearch {

    public static int search(String text, String pattern) {
        int pt = 0; // textを照合する位置
        int pp = 0; // patternを照合する位置

        while (pt != text.length() && pp != pattern.length()) {
            if (text.charAt(pt) == pattern.charAt(pp)) {
                pt++; // テキストを照合する位置を1文字後方にずらす
                pp++; // パターンを照合する位置を1文字後方にずらす
            } else {
                pt = pt - pp + 1; // テキストを照合する位置を戻し1文字後方にずらす
                pp = 0; // パターンを照合する位置を先頭に戻す
            }
        }

        if (pp == pattern.length()) { // 探索成功
            return pt - pp;
        }
        return -1; // 探索失敗
    }
}
