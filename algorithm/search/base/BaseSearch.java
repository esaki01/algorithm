package search.base;

public abstract class BaseSearch {

    /** 検索範囲のデータ. */
    protected int[] data;

    /** 検索対象の数値. */
    protected int target;

    public BaseSearch(int[] data, int target) {
        this.data = data;
        this.target = target;
    }

    /**
     * サーチ関数の抽象メソッド.
     * 全てのサーチクラスはこの関数を具象化する.
     */
    public abstract int search();
}
