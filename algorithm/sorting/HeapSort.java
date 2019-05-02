/*
ヒープソート.
選択ソートの応用的なアルゴリズム.
ヒープ（親の値が子の値以上であるという条件を満たす完全二分木）の特性をうまく利用してソートを行う.
ヒープから最大値である根を取り出す作業を繰り返し、その過程で取り出した値を並べていけば整列済みの配列が完成する.

POINT
ヒープを上左から順番に配列に格納すると、親のインデックスと子のインデックスの間には、以下の関係が成立する.
- 任意の要素data[i]に対して：
  - 親はdata[(i - 1) / 2]
  - 左の子はdata[i * 2 + 1]
  - 右の子はdata[i * 2 + 2]
 */
package sorting;

public class HeapSort {

    public static void sort(int[] data) {
        // data[i] 〜 data[data.length - 1]をヒープ化
        for (int i = (data.length - 1) / 2; i >= 0; i--) {
            downHeap(data, i, data.length - 1);
        }

        for (int i = data.length - 1; i > 0; i--) {
            // 最大要素と未ソート部末尾要素を交換
            int tmp = data[0];
            data[0] = data[i];
            data[i] = tmp;

            // data[0] 〜 data[i - 1]をヒープ化
            downHeap(data, 0, i - 1);
        }
    }

    /**
     * data[left] 〜 data[right]をヒープ化
     *
     * @param data データ配列
     * @param left 左端の要素のインデックス
     * @param right 右端の要素のインデックス
     */
    private static void downHeap(int[] data, int left, int right) {
        int root = data[left]; // 根
        int child; // 大きいほうの子
        int parent; // 親

        for (parent = left; parent < (right + 1) / 2; parent = child) {
            int cl = parent * 2 + 1; // 左の子
            int cr = cl + 1; // 右の子
            child = (cr <= right && data[cr] > data[cl]) ? cr : cl; // 大きいほう
            if (root >= data[child]) {
                break;
            }
            data[parent] = data[child];
        }
        data[parent] = root;
    }
}
