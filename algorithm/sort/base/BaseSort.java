package sort.base;

public abstract class BaseSort {

    /** ソートしたいデータ. */
    protected int[] data;

    public BaseSort(int[] data) {
        this.data = data;
    }

    /**
     * ソート関数の抽象メソッド.
     * 全てのソートクラスはこの関数を具象化する.
     */
    public abstract void sort();
}
