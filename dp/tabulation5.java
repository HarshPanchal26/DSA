package dp;
// import java.util.*;

import java.util.Arrays;
public class tabulation5 {
    
    static int solve(int [] array, int n ,int[] dp ){
        dp[0] = array[0];  ///2 1 4 9 

        /*dp[0] = 2        *
            pick = 1 ; non = 0  dp[1] = 1 ; pick = 4 + 0 ; non = 1 ;   
         */
        
        for(int i=1;i<n;i++){
            int pick = array[i];
            if(i>1) 
            pick += dp[i-2];
            
            int nonpick = 0 + dp[i-1];
            
            dp[i] = Math.max(pick, nonpick);
        }
        return dp[n-1];
    }
    
    public static int pick(int [] array, int size){
        int dp[] = new int[size];
        Arrays.fill(dp, 0);
        return solve(array,size,dp);
    } 
    public static void main(String[] args) {
        int arr[]={2,1,4,9};
        int n=arr.length;
        System.out.println(pick(arr ,n));
        // System.out.println(list.get(4));
     }
}
