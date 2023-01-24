package dp;

// import java.util.ArrayList;  
import java.util.Arrays;

public class ninijamemo {
    
    static int ninja(int day , int[][] pointer , int [][]dp, int last){
       if(dp[day][last]!=-1) return dp[day][last];

       if(day==0){
        int mini = 0 ;
        for(int i=0;i<=2;i++){
            if(i!=last){
                mini = Math.max(mini, pointer[0][i]);
            }
        
        }
        return mini;
       }
       int point =0 ;
       int mini ;
       for(int j=0;j<3;j++){
        if(j!=last){
            mini = pointer[day][j] + ninja(day-1, pointer, dp, j);
            point = Math.max(mini, point);
        }
    }
    return point;
 
    }
    static int f(int day , int pointer[][], int last){
        // int dp[][] = new int[day][3];
        // Arrays.fill(dp, -1);
        // System.out.println(dp);
    //    ArrayList<Integer> dp = new ArrayList<>();

         int dp[][] = new int[day][5];
        for(int[] row: dp)
            Arrays.fill(row, -1);

        return ninja(day , pointer , dp, last );
    }
    public static void main(String[] args) {
        
        int[][] pointer = {{10,40,70},
                          {20,50,80},
                          {30,60,10},
                          {10,40,90}};
        int n = pointer.length; 
        // f(n,points);
        System.out.println(f(n, pointer,3));
    }
}
//  1 2 3 4 5
//  5 1 2 3 4
//  4 5 1 2 3
//  3 4 5 1 2 =-> assume it as an input 

/*
 *  3 4 5 1 2 
 */


//  2 3 4 5 1 
