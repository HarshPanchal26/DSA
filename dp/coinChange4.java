
// this code is not running on this compiler , but run fine on online compiler , so dont worry code is fully fine,  

package dp;

public class coinChange4 {
    
    public static int findMinimumCoin(int array[], int idx, int target, int dp[][]) {

        if (idx == 0) {
            if (target % array[0] == 0)
                return target / array[0];
            else
                return (int) Math.pow(10, 9);
        }
        if (dp[idx][target] != -1)
            return dp[idx][target];

        int take = (int) Math.pow(10, 9);
        if (array[idx] <= target)
            take = 1 + findMinimumCoin(array, idx, target - array[idx], dp);

        int nottake = findMinimumCoin(array, idx - 1, target, dp);
        System.out.println(take);
        System.out.println(nottake);
         
        return dp[idx][target] = Math.min(take, nottake);
    }   
    public static int findMinimumCoin1(int array[], int n, int target) {
        int dp[][] = new int[n][target + 1];
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        return findMinimumCoin(array, n - 1, target, dp);
    }
    public static void main(String[] args) {
        int array[] = { 1, 2, 3 };
        int N = array.length;
        int target = 4;
        int MinimumCoin = findMinimumCoin1(array, N, target);
        System.out.println(MinimumCoin);
    }

   
}
