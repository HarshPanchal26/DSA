package dp;

import java.util.Arrays;

public class dp8t {
    static int fun(int m, int n , int [][]dp){
        
        for( int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0){
                dp[0][0]=1;
                continue;
                }
                
                int up = 0;
                int down = 0;

                if(i>0)
                up = dp[i-1][j];
                if(j>0)
                down = dp[i][j-1];
             
                dp[i][j]= up+down;

        }
        }
        return dp[m-1][n-1];
    }
    
    
    static int countWays(int m , int n){
        int dp[][]= new int[m][n];
        for(int[] row : dp)
          Arrays.fill(row, -1);
          return fun(m-1,n-1,dp);
     }
        public static void main(String[] args) {
        int  m = 4 ;
        int n = 3;
        System.out.println(countWays(m,n));
     }   
    }

    // Time Complexity: O(M*N)

    // Reason: There are two nested loops
    
    // Space Complexity: O(M*N)
    
    // Reason: We are using an external array of size ‘M*N’’.