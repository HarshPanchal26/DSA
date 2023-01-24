package dp;
/// recuersion + memorization 
// import java.util.*;
import java.util.Arrays;
class Frogjump{
static int solve(int ind,int[] height,int[] dp){
    if(ind==0) return 0;
    if(dp[ind]!=-1) return dp[ind];
    int jumpTwo = Integer.MAX_VALUE;
    // System.out.println(Math.abs(height[ind]-height[ind-1]));
    int jumpOne=  Math.abs(height[ind]-height[ind-1]) + solve(ind-1, height,dp);
    // System.out.println(jumpOne);
    if(ind>1)
    // System.out.println(Math.abs(height[ind]-height[ind-2]));
    jumpTwo =  Math.abs(height[ind]-height[ind-2]) + solve(ind-2, height,dp);
    // System.out.println(jumpTwo);
    
    return dp[ind]=Math.min(jumpOne, jumpTwo);
}


public static void main(String args[]) {

  int height[]={30,10,60,10,60,50};
  int n=height.length;
  int dp[]=new int[n];
  Arrays.fill(dp,-1);
  System.out.println(solve(n-1,height,dp));
  // System.out.println(height[n-1]);
  // System.out.println(n);
}
}

//  by using memoization 
