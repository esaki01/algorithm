/*
ヒープソート.
選択ソートの応用的なアルゴリズム.
ヒープ（親の値が子の値以上であるという条件を満たす完全二分木）の特性をうまく利用してソートを行う.

POINT
ヒープを上左から順番に配列に格納すると、親のインデックスと子のインデックスの間には、以下の関係が成立する.
- 任意の要素data[i]に対して：
  - 親はdata[(i - 1) / 2]
  - 左の子はdata[i * 2 + 1]
  - 右の子はdata[i * 2 + 2]

ヒープソートは、次の手順からできている.
- ヒープから最大値である根を取り出し、ヒープを再構築することを繰り返す
- 取り出した根を並べていく
 */
package sorting;

import java.util.Arrays;

public class HeapSort {

    public static void sort(int[] data) {
        System.out.println("data: " + Arrays.toString(data));
        // data[i] ~ data[data.length - 1]をヒープ化（初期の配列の並びをヒープ化する）
        for (int i = (data.length - 2) / 2; i >= 0; i--) { // 2分木なので親ノードのインデックスは「(data.length - 2) / 2」
            downHeap(data, i, data.length - 1);
            System.out.printf("data[%d] ~ data[%d]をヒープ化: %s\n", i, data.length - 1, Arrays.toString(data));
        }

        for (int i = data.length - 1; i > 0; i--) {
            // 最大要素（根）と未ソート部末尾要素を交換
            int tmp = data[0];
            data[0] = data[i];
            data[i] = tmp;

            // data[0] ~ data[i - 1]を再ヒープ化（最大要素を取り出して配列の末尾と交換し、配列の残り部分で再ヒープ化する）
            downHeap(data, 0, i - 1);
            System.out.printf("data[%d] ~ data[%d]を再ヒープ化: %s\n", 0, i - 1, Arrays.toString(data));
        }
    }

    /**
     * data[left] ~ data[right]をヒープ化する.
     * 手順
     * - 根を取り出す
     * - 最後の要素（最下流の最も右側に位置する要素）を根に移動する
     * - 大きい方の値を持つ子と交換して1つ下流に下りる作業を、根から始めて以下の条件のいづれか一方が成立するまで繰り返す
     *   - 子の方が値が小さい
     *   - 葉に到達した
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

            if (cr <= right && data[cr] > data[cl]) { // 大きいほうの子
                child = cr;
            } else {
                child = cl;
            }

            if (root >= data[child]) {
                break;
            }
            data[parent] = data[child];
        }
        data[parent] = root;
    }
}
