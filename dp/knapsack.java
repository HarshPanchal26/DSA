package dp;

public class knapsack {
    
     
    public static int findOptimal(int[] v, int[] w, int idx,int max,int dp[][]){
        
        //  ............................... first method...................
        if(idx==0){
            if(w[0]<=max) return v[0];
            else return 0;
        } 
        // if(max==0) return 0;
        
        if(dp[idx][max] != -1) return dp[idx][max];
        System.out.println(dp[idx][max]);

        int pick = Integer.MIN_VALUE;
        if(w[idx]<=max) pick+=v[idx] + findOptimal(v, w, idx-1, max-w[idx],dp);
        
        int notpick = 0 +findOptimal(v, w, idx-1, max,dp);

        return dp[idx][max] =Math.max(pick, notpick);

        //  ...............................secoend method ..............

        

        
    }
    public static int find(int v[], int w[],int n , int max ){

        int dp[][] =  new int[n][max+1];
        for (int row1[]: dp) {
            Arrays.fill(row1, -1);
        }

        System.out.println(dp[1][10]);
        
        return findOptimal(v, w, n-1, max, dp);
    }
    public static void main(String[] args) {
    int maxsize = 50;
    // int weight[] = {4,5,2,5};
    // int value[] =  {10,20,40,15};
    int weight[] =  {10,20,30};
    int value[] =  {60,100,120};
    int l = weight.length;
    int result = find(value,weight,l,maxsize);
    System.out.println(result);

 }   
}
