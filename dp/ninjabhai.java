package dp;
import java.util.Arrays;
class ninjabhai {
    static int maxChocoUtil(int i, int j1, int j2, int n, int m, int[][] grid, 
    int[][][] dp) {
      if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m)
        return 0;
  
      if (i == n - 1) {
        if (j1 == j2)
          return grid[i][j1];
        else
          return grid[i][j1] + grid[i][j2];
      }
  
      if (dp[i][j1][j2] != -1)
        return dp[i][j1][j2];
  
      int maxi = Integer.MIN_VALUE;
      for (int di = -1; di <= 1; di++) {
        for (int dj = -1; dj <= 1; dj++) {
          int ans;
          if (j1 == j2)
            ans = grid[i][j1] + maxChocoUtil(i + 1, j1 + di, j2 + dj, n, m, grid, dp);
          else
            ans = grid[i][j1] + grid[i][j2] + maxChocoUtil(i + 1, j1 + di, j2 + dj,n,
            m, grid, dp);
          maxi = Math.max(maxi, ans);
        }
      }
      return dp[i][j1][j2] = maxi;
    }
  
    static int maximumChocolates(int n, int m, int[][] grid) {
  
      int dp[][][] = new int[n][m][m];
  
      for (int row1[][]: dp) {
        for (int row2[]: row1) {
          Arrays.fill(row2, -1);
        }
      }
  
      return maxChocoUtil(0, 0, m - 1, n, m, grid, dp);
    }
  
    public static void main(String args[]) {
  
      int matrix[][] = {{2,3,1,2},
                        {3,4,2,2},
                        {5,6,3,5}};
      int n = matrix.length;
      int m = matrix[0].length;
  
      System.out.println(maximumChocolates(n, m, matrix));
    }
  }