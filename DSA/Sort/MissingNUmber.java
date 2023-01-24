//  using cyclic sort  ====> O(N) [time complexity]

package DSA.Sort;

import java.util.Arrays;

public class MissingNUmber {

    public static void main(String[] args) {
        int array[] = { 2, 3, 4, 1 };
        cycle(array);/// where number is in range of [1 , N]

        // for [0,N] SOME SMALL CHNAGES ARE NECCESSARY
        System.out.println(Arrays.toString(array));
        int missing = findMissingNumber(array);
        System.out.println(missing);

    }

    private static int findMissingNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {  // FOR [0,N] IF(ARRAY[I] != I) return i else return -1
                return i + 1;
            }
        }
        return -1;
    }

    public static void cycle(int array[]) {
        // 5 2 1
        int i = 0;
        while (i < array.length) {
            int correctidx = array[i] - 1;
            if (array[i] < array.length && array[i] != array[correctidx]) {
                swap(array, i, correctidx);
            } else {
                i++;
            }

        }
    }

    public static void swap(int array[], int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
