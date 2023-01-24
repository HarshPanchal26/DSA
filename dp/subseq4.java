package dp;

import java.util.ArrayList;

public class subseq4 {
    public static boolean addseq(ArrayList<Integer> list , int idx, int n , ArrayList<Integer> list2 ,int sum){
        int s = 6;
        if(idx==n){
            if(sum==s){
                System.out.println(list2);
                return true;

            }
            else return false ;
        }
        list2.add(list.get(idx));
        sum+=list2.get(idx);
        // System.out.println(list2);
        if(addseq(list, idx+1, n,list2,sum) == true){
           return true; 
        }
        list2.remove(list.get(idx));
        sum-=list2.get(idx);
        // System.out.println(list2);
        if(addseq(list, idx+1, n, list2,sum) == true){
            
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        int sum = 0;
        addseq(list ,0,3, list2, sum);
    // System.out.println(list.size());
    }
}


//  stop repitation of recuersion while answer has been founded 
// reduce space complexity 
//  time complexity as well
