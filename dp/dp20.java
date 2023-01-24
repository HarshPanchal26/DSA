// Minimum Coins (DP – 20)
// Problem Statement:  Minimum Coins

// We are given a target sum of ‘X’ and ‘N’ distinct numbers denoting the coin denominations. We need to tell the minimum number of coins required to reach the target sum. We can pick a coin denomination for any number of times we want.

// see coinChange4.java;

package dp;

public class dp20 {

    public static int findMinimumCoin1(int array[], int n, int target) {
        int dp[][] = new int[n + 1][target + 1];

        for (int i = 0; i <= target; i++) {
            if (i % array[0] == 0)
                dp[0][i] = i / array[0];
            else
                dp[0][i] = (int) Math.pow(10, 9);
        }

        for (int idx = 1; idx <= n; idx++) {
            for (int t = 0; t <= target; t++) {
                int take = (int) Math.pow(10, 9);
                if (array[idx] <= t) {

                    // System.out.println(array[idx]);
                    take = 1 + dp[idx][t - array[idx]];
                }
                int nottake = 0 + dp[idx - 1][t];

                dp[idx][t] = Math.min(take, nottake);

            }
        }
        int ans = dp[array.length - 1][target];
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;

        // time = > O(N*T) two nested loop
        // space => 0(N*t)
    }

    public static int optimalApproch(int array[], int n, int target) {
        int prev[] = new int[target + 1];
        int curr[] = new int[target + 1];

        for (int i = 0; i <= target; i++) {

            if (i % array[0] == 0)
                prev[i] = i / array[0];
            else
                prev[i] = (int) Math.pow(10, 9);
        }

        for (int idx = 1; idx <= n; idx++) {

            for (int t = 0; t <= target; t++) {
                int take = (int) Math.pow(10, 9);
                if (array[idx] <= t)
                    take = 1 + curr[t - array[idx]];

                int nottake = 0 + prev[t];

                curr[t] = Math.min(take, nottake);

            }

            prev = curr;
        }
        if (prev[target] >= (int) Math.pow(10, 9))
            return -1;
        else
            // System.out.println(prev[target]);
            return prev[target];
    }

    // time = > O(N*T) two nested loop
    // space => O(T)+O(T) => O(T)    
    public static void main(String[] args) {
        int target = 7;
        int array[] = { 1, 2 };
        int N = array.length;
        int MinimumCoin = findMinimumCoin1(array, N - 1, target); // tabulation
        int MinimumCoin2 = optimalApproch(array, N - 1, target); // space optimization
        System.out.println("tabulation : " + MinimumCoin);
        System.out.println("space optimization  : " + MinimumCoin2);
    }
}
