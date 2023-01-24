package dp;
// find maximum sum of subseq with constarint that no adjasant element should be picked up 

import java.util.ArrayList;

public class subseq5 {
   public static int pick(ArrayList<Integer> list,int size, int idx,int [] dp){
    if(idx==0){
        // System.out.println(list2);
        return list.get(idx);
    }
    if(idx<0){
        return 0;
    }
    if(idx==1){
        return list.get(idx);
    }
    if(dp[idx]==-1){
        return dp[idx];
    }
     int lft = list.get(idx) + pick(list, size, idx-2,dp);

     int rgt = 0 + pick(list,size,idx-1,dp);
      dp[idx] = (Math.max(lft, rgt));
     return (Math.max(lft, rgt));


   }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Vector<Integer> dp = Arra
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(3);
        int dp[] = new int[list.size()];
       System.out.println(pick(list ,list.size(),list.size()-1,dp));
    // System.out.println(dp.get(2));
    }
}

// by DP time comp --> o(n)
    //  space ==> O(N) + 0(N);


    //  for tabulation see tabulation5.java