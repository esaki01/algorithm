package string_searching.abstract_object;

public abstract class AbstractStringSearch {

    /** 探索する文字列. */
    protected String text;

    /** 探索対象のパターン. */
    protected String pattern;

    protected AbstractStringSearch(String text, String pattern) {
        this.text = text;
        this.pattern = pattern;
    }

    /**
     * サーチ関数の抽象メソッド.
     * 全てのサーチクラスはこの関数を具象化する.
     *
     * 検索成功時：探索対象のパターンが存在する、探索する文字列のインデックスを返却する
     * 検索失敗時：-1を返却する
     */
    public abstract int search();
}
