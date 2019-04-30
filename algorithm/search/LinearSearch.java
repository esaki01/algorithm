/*
線形探索法（リニアサーチ）.
先頭から順番に調べて探す探索アルゴリズム.
 */
package search;

import search.base.BaseSearch;

public class LinearSearch extends BaseSearch {

    LinearSearch(int[] data, int target) {
        super(data, target);
    }

    @Override
    public int search() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}