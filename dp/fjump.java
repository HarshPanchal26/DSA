//  WITHOUT DYNAMIC PROGRAMING 
// TIME == O(2^N);
// SPACE == O(N)
package dp;
public class fjump {
   public static int solve(int array[], int n ){
    if(n==0) return 0;
    int jumpTwo = Integer.MAX_VALUE;
    int jumpOne = solve(array, n-1) + Math.abs(array[n]-array[n-1]);
    if(n>1)
      jumpTwo = solve(array, n-2) + Math.abs(array[n]-array[n-2]);

      return Math.min(jumpOne, jumpTwo);

   }
    public static void main(String[] args) {
        
        int height[] = {30,10,60 , 10 , 60 , 50};
        int n = height.length;
        System.out.println(solve(height,n-1));
}
}
