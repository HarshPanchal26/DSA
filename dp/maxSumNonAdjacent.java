package dp;

public class maxSumNonAdjacent {
    public static int maxsum(int array[], int idx){

        // public static int maximumNonAdjacentSum(ArrayList<Integer> array) {
            int dp[] = new int[array.length];
            dp[0] =0;
            int take=0;
            int not=0;
            for(int i=0;i<array.length;i++){
                  take = array[i];
                if(i>1) 
                    take=take+dp[i-2];
                if(i>1)
                  not = dp[i-1];
                
                dp[i] = Math.max(take,not);
            }
            return dp[array.length-1];
        }
    
    public static void main(String[] args) {
        // int array[] = {1,2,3,1,3,5,8,1,9};
        // int array[] = {11,55,17,23,97,11,3,64,45,25};
        // int array[] = {76 ,31, 35, 96, 7, 20, 22, 6, 92, 76};
        // int array[] =  {84 ,83 ,7 ,82 ,97 ,67 ,74 ,87 ,57 ,16};
        //    int array[] = {1, 51 ,70 ,19 ,82, 25, 57 ,77 ,26 ,3};
        // int array[] =  {0 ,85 ,12 ,89 ,7 ,91 ,73 ,39 ,65 ,52};
        int array[] = {44 ,67 ,33 ,20 ,77 ,48 ,12 ,32 ,88 ,38};
        int sum = maxsum(array,array.length-1);
        System.out.println(sum);
    }
}
