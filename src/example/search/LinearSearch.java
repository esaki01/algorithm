/*
線形探索法.
先頭から順番に調べて探す探索アルゴリズム.
 */
package example.search;

public class LinearSearch {
    public static void main(String[] args){
        int[] array = {4, 2, 3, 5, 1};
        int value = 5;
        search(array, value);
    }

    private static void search(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.printf("%d番目の要素に%dが格納されています.", i, value);
                return;
            }
        }
        System.out.printf("%dは見つかりませんでした.", value);
    }
}