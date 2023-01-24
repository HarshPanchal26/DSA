package dp;

public class countSubWithSumK2 {
    public static int findNumberOfSubset(int array[], int sum){ 

        int n = array.length;
        int dp[][] = new int[array.length][sum+1];
        for(int i=0;i<n;i++){
            dp[i][0] = 1; 
           
            }
        if(array[0]<=sum) dp[0][array[0]] = 1 ;
        
        for(int idx=1;idx<n;idx++){
            for(int target=1;target<=sum;target++){

                int take = 0;
                if(array[idx]<=target) take+=dp[idx-1][target-array[idx]];

                int nottake = dp[idx-1][target];

                dp[idx][target] = take + nottake;

            }
        }

        return dp[n-1][sum];

       
       
    }
    public static void main(String[] args) {
        // int array[] = {2,4,2,3,6,3};
        int array[] = {0,1,0,0};
        int target = 1;
        

        int result = findNumberOfSubset(array,target);
        System.out.println(result);
    }
}


// Time Complexity: O(N*K)

// Reason: There are two nested loops

// Space Complexity: O(N*K)

// Reason: We are using an external array of size ‘N*K’. Stack Space is eliminated.