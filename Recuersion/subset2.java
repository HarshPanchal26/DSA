// program to inly find the number of subset for given condition .......

package Recuersion;
// import java.util.ArrayList;

public class subset2 {
    // package Recuersion;
  public static int find(int array[], int sum , int idx, int n , int s){

        // if(idx==n && s==sum) System.out.println(result);   // see why we should not code this line like this 
        if(idx==n){
            if(s==sum){
                // System.out.println(result);
                return 1 ;
            }
            return 0;
        }
         
        // result.add(array[idx]);
        s+=array[idx];
        int take = find(array, sum, idx+1, n, s);

        s-=array[idx];
        // result.remove(result.size()-1);
        int nottake = find(array, sum, idx+1, n, s);

        return take + nottake;
}
    public static void main(String[] args) {
        int array[] = {1,2,4,4};
        int sum = 5;
        // ArrayList<Integer> list = new ArrayList<>();
        int  res =   find(array,sum,0,array.length,0);
        System.out.println(res);
    }
}
 

/// if u want to print only one subset then use this technique of true and false ;; 
// otherwise if u want all the related subset then go with the simple method (without true false insted use void )

