package Recuersion;

import java.util.ArrayList;

public class subset {
    
    public static boolean find(int array[], int sum , int idx, int n , int s, ArrayList<Integer> result){

        // if(idx==n && s==sum) System.out.println(result);   // see why we should not code this line like this 
        if(idx==n){
            if(s==sum){
                System.out.println(result);
                return true ;
            }
            return false;
        }
         
        result.add(array[idx]);
        s+=array[idx];
        if(find(array, sum, idx+1, n, s, result)==true) return true ;

        s-=array[idx];
        result.remove(result.size()-1);
        if(find(array, sum, idx+1, n, s, result)==true) return true;

        return false ;
}
    public static void main(String[] args) {
        int array[] = {1,2,4,4};
        int sum = 5;
        ArrayList<Integer> list = new ArrayList<>();
        boolean res =   find(array,sum,0,array.length,0,list);
        System.out.println(res);
    }
}
 

/// if u want to print only one subset then use this technique of true and false ;; 
// otherwise if u want all the related subset then go with the simple method (without true false insted use void )