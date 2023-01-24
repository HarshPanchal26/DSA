package dp;



public class dp11t {
    
    public static int fun(int array[][], int n ){
        int dp[][] = new int[n][n];

        for(int j=0 ; j<n ; j++){
            dp[n-1][j] = array[n-1][j];
        }

        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int up = array[i][j] + dp[i+1][j];
                System.out.println(dp[i+1][j]);
                int down = array[i][j] + dp[i+1][j+1];
                System.out.println(dp[i+1][j+1]);
            
              dp[i][j] = Math.min(up, down);
            }
        }
        return dp[0][0];

    }
    public static void main(String[] args) {
        int tringle[][] = {{1},
                           {2,3},
                           {3,6,7},
                           {8,9,6,10}};
        // int i = 0, j = 0 ; 
        // System.out.println(tringle.length);                  
        System.out.println(fun(tringle, tringle.length));

    }
}

// Time Complexity: O(N*N)

// Reason: There are two nested loops

// Space Complexity: O(N*N)

// Reason: We are using an external array of size ‘N*N’. The stack space will be eliminated.