package searching.abstract_object;

public abstract class AbstractSearch {

    /** 検索範囲のデータ配列. */
    protected int[] data;

    /** 検索対象の数値. */
    protected int target;

    protected AbstractSearch(int[] data, int target) {
        this.data = data;
        this.target = target;
    }

    /**
     * サーチ関数の抽象メソッド.
     * 全てのサーチクラスはこの関数を具象化する.
     *
     * 検索成功時：検索対象の数値が存在する、検索範囲のデータ配列のインデックスを返却する
     * 検索失敗時：-1を返却する
     */
    public abstract int search();
}
