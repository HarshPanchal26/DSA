package Recuersion;
import java.util.*;

public class subset5 {
   
    public static void find(int array[], int sum , int idx, ArrayList<Integer> result , ArrayList<ArrayList<Integer>> res){
        if(sum==0){
            res.add(new ArrayList<>(result));
            return; 
        }

        for(int i=idx;i<array.length;i++){
            if(i>idx && array[i]==array[i-1]) continue;
            if(array[i]>sum) break;
             
            result.add(array[i]);
            find(array, sum-array[i], idx+1, result, res);

            result.remove(result.size()-1);



        }


    }

    public static void main(String[] args) {
        int array[] = {1,2,4,4,3};
        int sum = 5;
        Arrays.sort(array);
        // ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        find(array,sum,0,new ArrayList<>(),res);
        System.out.println(res);

    }
}
