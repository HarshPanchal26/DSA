//  with memoization 

package dp;

import java.util.Arrays;

public class dp8 {
 
 static int fun(int i , int j , int[][]dp){{
    if(i==0 && j==0)
    return 1;
    if(i<0||j<0)
    return 0 ;
    if(dp[i][j]!=-1)
    return dp[i][j];

    int up = fun(i-1,j,dp);

    int down = fun(i,j-1,dp);

    return up+down;
 }}
 
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

// Reason: At max, there will be M*N calls of recursion.

// Space Complexity: O((N-1)+(M-1)) + O(M*N)

// Reason: We are using a recursion stack space:O((N-1)+(M-1)), here (N-1)+(M-1) is the path length and an external DP Array of size ‘M*N’.