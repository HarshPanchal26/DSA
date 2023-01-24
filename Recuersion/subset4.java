package Recuersion;

import java.util.ArrayList;

public class subset4 {
    
    public static ArrayList<ArrayList<Integer>> find(int array[], int sum , int idx, int n , int s, ArrayList<Integer> result , ArrayList<ArrayList<Integer>> res){
        
        
            if(s==sum) {
                res.add(new ArrayList<>(result));
                System.out.println("hrrlo");
                return res;
            }
       
        
        for(int i=idx;i<array.length;i++){
            if(i>0 && array[i] == array[i-1]) continue;
            if(s+array[i]>sum) break;
            
            result.add(array[idx]);
            s+=array[idx];
            find(array, sum, idx+1, n, s, result,res);
            System.out.println(result);
            
            result.remove(result.size()-1);
            // s-=array[idx];
        }
    return res;
}
    public static void main(String[] args) {
        int array[] = {1,2,4,4};
        int sum = 4;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result =  find(array,sum,0,array.length,0,list,res);
        System.out.println(result);

        
    }
}
 

/// if u want to print only one subset then use this technique of true and false ;; 
// otherwise if u want all the related subset then go with the simple method (without true false insted use void )

