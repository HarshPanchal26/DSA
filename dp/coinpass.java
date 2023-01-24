
/////////////////////////// wrong /////////////////////

// package dp;

// public class coinpass {
//     public static void main(String[] args) {
//         System.out.println("hello");

//         int array[] = { 1, 2, 3 };
//         int N = array.length;
//         int target = 7;
//         int MinimumCoin = findMinimumCoin1(array, N, target);
//         System.out.println(MinimumCoin);

//     }

//     public static int findMinimumCoin1(int array[], int n, int target) {
//         long dp[][] = new long[n][target + 1];
//         for (long row[] : dp) {
//             Arrays.fill(row, -1);
//         }
//         return findMinimumCoin(array, n - 1, target, dp);
//     }

//     public static int findMinimumCoin(int array[], int idx, int target, long dp[][]) {
//         System.out.println("harsh");
//         if (idx == 0) {
//             if (target % array[0] == 0)
//                 return target / array[0];
//             else
//                 return (int) Math.pow(10, 9);
//         }
//         if (dp[idx][target] != -1)
//             return (int) dp[idx][target];

//         long take = (int) Math.pow(10, 9);
//         if (array[idx] <= target)
//             take = 1 + findMinimumCoin(array, idx, target - array[idx], dp);

//         long nottake = findMinimumCoin(array, idx - 1, target, dp);
//         System.out.println(take);
//         System.out.println(nottake);
//         // dp[idx][target] = Math.min(take, nottake);
//         // System.out.println(dp[idx][target]);

//         return (int) (dp[idx][target] =   Math.min(take, nottake));
//     }
// }
