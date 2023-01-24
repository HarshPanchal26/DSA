package Recuersion;

import java.util.ArrayList;

public class subset3 {
    
    public static ArrayList<ArrayList<Integer>> find(int array[], int sum , int idx, int n , int s, ArrayList<Integer> result , ArrayList<ArrayList<Integer>> res){
        
        // if(idx==n && s==sum) System.out.println(result);   // see why we should not code this line like this 
        if(idx==n){
            if(s==sum) {
                res.add(new ArrayList<>(result));
            }
            return res;
        }
        
        if(array[idx]<=sum){ // aa line samaj nathi padi (without using it we could also get answer )

            result.add(array[idx]);
            s+=array[idx];
            find(array, sum, idx+1, n, s, result,res);
            
            s-=array[idx];
            result.remove(result.size()-1);
        }   //  aaya suhdi 
        find(array, sum, idx+1, n, s, result ,res);
        
        // System.out.println(res);
        return res;
}
    public static void main(String[] args) {
        int array[] = {1,2,4,4};
        int sum = 5;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result =  find(array,sum,0,array.length,0,list,res);
        System.out.println(result);

        
    }
}
 

/// if u want to print only one subset then use this technique of true and false ;; 
// otherwise if u want all the related subset then go with the simple method (without true false insted use void )

