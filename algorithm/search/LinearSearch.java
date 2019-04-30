/*
線形探索法（リニアサーチ）.
先頭から順番に調べて探す探索アルゴリズム.
 */
package search;

import search.abstract_object.AbstractSearch;

public class LinearSearch extends AbstractSearch {

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