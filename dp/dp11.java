package dp;

// import java.lang.reflect.Array;
import java.util.Arrays;

public class dp11{

    public static int f(int array[][], int n ,int i , int j , int [][] dp){
        if(i==n-1) return array[n-1][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int up = array[i][j] + f(array, n, i+1, j, dp);
        
        
        int down = array[i][j] + f(array, n, i+1, j+1, dp);

        return dp[i][j] = Math.min(up, down);
    }
    
    public static int minimalpath(int array[][] , int n ,int i, int j ){
        int dp[][] = new int[n][n];
        for(int row[] : dp)
        Arrays.fill(row, -1);
        return f( array, n ,i,j ,dp );
    }
    public static void main(String[] args) {
        int tringle[][] = {{1},
                           {2,3},
                           {3,6,7},
                           {8,9,6,10}};
        int i = 0, j = 0 ;                   
        System.out.println(minimalpath(tringle, tringle.length,i,j));
    }
}


// Time Complexity:  somthing O(2^n)

// Reason: There are two nested loops

// Space Complexity: O(N*N)  + O(N)

// Reason: We are using an external array of size ‘N*N’. The stack space will be eliminated.