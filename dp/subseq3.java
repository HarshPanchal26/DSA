package dp;

import java.util.ArrayList;




public class subseq3 {
    public static void addseq(ArrayList<Integer> list , int idx, int n , ArrayList<Integer> list2){
        int count = 0;
        if(idx==n){
            int sum = 0;
            for(int i = 0; i<list2.size();i++){
                 sum+=list2.get(i);
            }
            if(sum>=6){
            System.out.println(list2);
            count++;
        }
           System.out.println(count);
            return;
        }
        list2.add(list.get(idx));
        // System.out.println(list2);
        addseq(list, idx+1, n,list2);
        list2.remove(list.get(idx));
        // System.out.println(list2);
        addseq(list, idx+1, n, list2);
        return;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        addseq(list ,0,3, list2);
    // System.out.println(list.size());
    }
}
