package Recuersion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutations {
    public static void main(String[] args) {
        int array[] = {'a','b','c'};
        List<List<Character>> ans = new ArrayList<>();
        List<Character> ds = new ArrayList<>();
        boolean frq[] = new boolean[array.length];
        ceratePermu(array,ans,ds,frq);
        System.out.println(ans);
    }
    public static void ceratePermu(int[] array, List<List<Character>> ans, List<Character> ds, boolean[] freq) {
    
        if(ds.size()==array.length){
            // System.out.println(ds);
            ans.add(new ArrayList<>(ds));
        }
        for(int i=0;i<array.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add((char)array[i]);
                ceratePermu(array, ans, ds, freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
}

// Time Complexity:  N! x N

// Space Complexity:  O(N) + O(N)