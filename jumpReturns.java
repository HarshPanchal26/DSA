
public class jumpReturns {

    public static int find(int array[], int idx, int n) {
        // if (idx == n)
        //     return 0;
        // if (array[idx] == 0)
        //     return Integer.MAX_VALUE;
        if (idx >= n)
            return 0;

        int min = Integer.MAX_VALUE;
        for (int i = idx + 1; i <= n && i <= idx + array[idx]; i++) 
        {
            int jump = find(array, i, n);
            // if (jump != Integer.MAX_VALUE && jump + 1 < min) {
            //     min = jump + 1;
            // }
            System.out.println("max1 " + min + "        ");
            if(jump!=Integer.MAX_VALUE)
            min = Math.min(min, jump+1);
            System.out.print( "max2  " + min + " ");
        }
        return min;
    }
    // Time Complexity ==> O(nN^n)  
    // Auxillary stack space => o(N);
    public static int find2(int array[],int idx,int n){
       int jump[] = new int[n];
        
       if(n==0||array[0]==0){
        return Integer.MAX_VALUE;
       }

       jump[0] = 0;

       for(int i=1;i<n;i++){
       jump[i] = Integer.MAX_VALUE;
        for(int j=0;j<i;j++){
          if(i<=j+array[j] && jump[j]!=Integer.MAX_VALUE ){
            jump[i] = Math.max(jump[i], jump[j]+1);
            break;
          }
        }
       }
       return jump[n-1];
   }          
   public static void main(String[] args) {
        int array[] = { 2, 2, 1, 1, 4 };
        
        // int array[] = {1,1,1};
        // int dp = new int[][];
        int jump = find(array, 0, array.length - 1);
        // int jump2 = find2(array, 0, array.length - 1);
        System.out.println(jump);

    }

}
