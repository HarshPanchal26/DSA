package dp;

public class countSubWithSumK {
    public static int findNumberOfSubset(int array[], int sum, int idx,int [][]dp){ 

        
        // if(idx<=0){
        //     if(array[idx]==sum) return 1;
        //     else return 0;
        // }
        // if(sum==0) return 1;


        /*
         * idoly when input is {0,0,1}  and target is 1, o/p should be equal to 4 , but in by this case o/p came out 
         * is 1 . 
         * so for handle this situation 
         * 
         * condition must be like 
         * if(idx==0){
         * if(sum==0 && arr[idx]==0 ) return 2 ;
         * if(sum==0 &&  sum==arr[0]) return 1;
         * return 0;
         * } 
         * 
         * 
         * for more details watch dp-18 video 
         */
        
        if(sum==0)
        return 1;
        
        if(idx==0)
        return array[0] == sum?1:0;
        if(dp[idx][sum]!=-1) return dp[idx][sum];
        int pick = 0;
        if(array[idx]<=sum) pick = findNumberOfSubset(array, sum-array[idx], idx-1,dp);

        int notpick = findNumberOfSubset(array, sum, idx-1,dp);

        // dp[idx][sum] = pick + notpick;

        return dp[idx][sum] = pick + notpick;
       
    }
    public static void main(String[] args) {
        int array[] = {2,4,2,3,6,3};
        int target = 4;
        int dp[][] = new int[array.length][target+1];
        // Arrays.fill(dp,-1);
        for(int row[]: dp)
            Arrays.fill(row,-1);

        int result = findNumberOfSubset(array,target,array.length-1,dp);
        System.out.println(result);
    }
}


// Time Complexity: O(N*K)

// Reason: There are N*K states therefore at max ‘N*K’ new problems will be solved.

// Space Complexity: O(N*K) + O(N)

// Reason: We are using a recursion stack space(O(N)) and a 2D array ( O(N*K)).