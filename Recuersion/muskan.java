package Recuersion;

import java.util.ArrayList;
import java.util.List;

public class muskan {
    class Solution {
        private static ArrayList<List<Integer>> temp;
        public static void main(String[] args) {
            int array[] = {1,2,3};
            List<List<Integer>> al = subsets(array);
            for (List<Integer> list : al) {
                System.out.print(list + " ");
            }
        }

        public static List<List<Integer>> subsets(int[] nums) {
            return sub(nums,0,nums.length+1);
        }
        public static ArrayList<List<Integer>> sub(int[] nums,int i,int len){
            if(i==len){
                ArrayList<List<Integer>> al=new ArrayList<List<Integer>>();
                ArrayList<Integer> list=new ArrayList<Integer>();
                
                al.add(list);
                System.out.println(al);
                return al;
            }
            else{
                int n=nums[i];
                ArrayList<List<Integer>> res=sub(nums,i+1,len);
                System.out.println(res);
                temp = (ArrayList<List<Integer>>)res.clone();
               
                // Sys;
                for(int j=0;j<temp.size();j++){
                    System.out.println(res);
                    temp.get(j).add(n);
                    System.out.println(temp+"temp"+j);
    
                    System.out.println(res);
                    res.add(temp.get(i));
                    
                }
    
                return res;
                
            }
        }
    }
}
  
