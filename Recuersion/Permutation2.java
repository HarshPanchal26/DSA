package Recuersion;


import java.util.ArrayList;
import java.util.List;

public class Permutation2 {
 public static void main(String[] args) {
    int array[] = {1,2,3};
    List<List<Integer>> ans = new ArrayList<>(); ;
    createPermu(array,0,ans);
    System.out.println(ans);
 }  
 public static void createPermu(int array[], int idx , List<List<Integer>> ans ){
     
    if(idx==array.length){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        // ans.add(new ArrayList<>(list));  // both are same 
        ans.add(list);
        return;
    }
    
    for(int i=idx;i<array.length;i++){
        swap(i,idx,array);
        System.out.println("first value of " + i + " " + idx);
        createPermu(array, idx+1, ans);
        swap(i,idx,array);
        System.out.println(" ...............secoend value of " + i + " " + idx);

    }
 } 

 public static void swap(int i ,int j , int array[]){
    int tmp = array[i];
     array[i] = array[j];
     array[j] = tmp;


 }
}
// Time Complexity:  N! x N

// Space Complexity:  O(N) + 