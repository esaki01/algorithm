package sort.abstract_object;

public abstract class AbstractSort {

    /** ソートしたいデータ. */
    protected int[] data;

    protected AbstractSort(int[] data) {
        this.data = data;
    }

    /**
     * ソート関数の抽象メソッド.
     * 全てのソートクラスはこの関数を具象化する.
     */
    public abstract void sort();
}
