package DSA.BinnarySerch;

/*
 *    1  2  3  4
 *    5  6  7  8
 *    9 10 11 13
 */
public class BinnarySerch2D {
    public static void main(String[] args) {

        int array[][] = { { 1, 2, 3, 4 },
                          { 5, 6, 7, 8 },
                          { 9, 10, 11, 12 } };
        int target = 1;
        int r[] = find(array, target); // O(n)
        System.out.println(r[0] + "," + r[1]);
        // find2(array, target); // O(logn)
    }
    // public static void find2(int array[][] , int target){
    //    int row = array.length-1;
    //    int col = array[0].length-1;
       
       

    // }
    public static int[] find(int array[][], int target) {
        int start = 0;
        int end = array[0].length - 1;

        while (start < array.length && end>=0) {
            if (array[start][end] == target)
                return new int[] { start, end };

                if (array[start][end]  < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] { -1, -1 };
    }
}

// Time Complexity: O(N + M), where N is the number of rows and M is the number of columns.
// Auxiliary Space: O(1)
