package dp;

public class countSubWithSumK3 {
    public static int findNumberOfSubset(int array[], int sum){ 

        int n = array.length;
        int prev[] = new int[sum+1];
        
            prev[0] = 1; 
        
        if(array[0]<=sum) prev[array[0]] = 1 ;
        
        for(int idx=1;idx<n;idx++){
            int curr[] = new int[sum+1];
            curr[0] =1 ;
            for(int target=1;target<=sum;target++){

                int take = 0;
                if(array[idx]<=target) take+=prev[target-array[idx]];

                int nottake = prev[target];

                curr[target] = take + nottake;

            }
            prev = curr;
        }

        return prev[sum];

       
       
    }
    public static void main(String[] args) {
        // int array[] = {2,4,2,3,6,3};
        // int target = 4;
        int array[] = {1,2,2,3};
        int sum=3;
      

        int result = findNumberOfSubset(array,sum);
        System.out.println(result);
    }
}


// Time Complexity: O(N*K)

// Reason: There are two nested loops

// Space Complexity: O(K)

// Reason: We are using an external array of size ‘K+1’ to store only one row.