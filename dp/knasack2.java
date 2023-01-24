package dp;

public class knasack2 {
    public static int find(int v[], int w[], int idx, int max) {

        // int dp[][] = new int[idx][max + 1];

        // for (int i = 0; i <= max; i++) {
        // dp[0][i] = v[0];
        // }

        // for (int i = 1; i <idx; i++) {
        // for (int cap = 0; cap <= max; cap++) {

        // int notpick = dp[i - 1][cap];
        // int pick = 0;
        // if (w[i] <= cap)
        // pick += v[i] + dp[i - 1][cap - w[i]];

        // dp[i][cap] = Math.max(pick, notpick);

        // }
        // }
        // return dp[idx - 1][max];

        int prev[] = new int[max + 1];
        // int curr[] = new int[max + 1];
        for (int i = w[0]; i <= max; i++) {
            prev[i] = v[0];

        }

        // to make this programn run throwa single auxillaru array we need to create a
        // reverse for loop (secoend for loop)
        /*
         * we can do that bcz if we start from the right , we only need is left most
         * elments (bcz od max - w[i]),
         * so we can easily modify array
         * 
         * its only work for right -> left traversal
         */
        for (int i = 1; i < idx; i++) {
            for (int cap = max; cap >= 0; cap--) {
                int notTaken = 0 + prev[cap];

                int taken = Integer.MIN_VALUE;
                if (w[i] <= cap)
                    taken = v[i] + prev[max - w[i]];

                prev[cap] = Math.max(taken, notTaken);
            }
            // prev = curr;
        }

        return prev[max];
    }

    public static void main(String[] args) {
        int maxsize = 5;
        // int weight[] = {4,5,2,5};
        // int value[] = {10,20,40,15};
        int weight[] = { 1, 2, 4, 5 };
        int value[] = { 5, 4, 8, 6 };
        int l = weight.length;
        int result = find(value, weight, l, maxsize);
        System.out.println(result);
    }
}

/*
 * time => O(N*W)
 * space => O(W)
 */