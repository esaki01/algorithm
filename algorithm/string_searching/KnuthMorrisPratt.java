/*
KMP（Knuth-Morris-Pratt）法.
テキスト（文字列）から探索文字列（パターン）を探すにあたり、
不一致となった位置と単語自身の情報から次に照合を試すべき位置を決定することで検索を効率化するアルゴリズム.
 */
package string_searching;

import string_searching.abstract_object.AbstractStringSearch;

public class KnuthMorrisPratt extends AbstractStringSearch {

    KnuthMorrisPratt(String text, String pattern) {
        super(text, pattern);
    }

    @Override
    public int search() {
        int pt = 1; // textを照合する位置
        int pp = 0; // patternを照合する位置
        int[] skip = new int[pattern.length() + 1]; // スキップテーブル

        // スキップテーブルの作成
        skip[pt] = 0;
        while (pt != pattern.length()) {
            if (pattern.charAt(pt) == pattern.charAt(pp)) {
                skip[++pt] = ++pp;
            } else if (pp == 0) {
                skip[++pt] = pp;
            } else {
                pp = skip[pp];
            }
        }

        // 探索
        pt = pp = 0;
        while (pt != text.length() && pp != pattern.length()) {
            if (text.charAt(pt) == pattern.charAt(pp)) {
                pt++;
                pp++;
            } else if (pp == 0) {
                pt++;
            } else {
                pp = skip[pp];
            }
        }

        if (pp == pattern.length()) { // 探索成功
            return pt - pp;
        }
        return -1; // 探索失敗
    }
}
