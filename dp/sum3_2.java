package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



public class sum3_2 {

    // public static List<List<Integer>> threeSum()
    public static List<List<Integer>> Sum3(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sub = null;
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i : nums) {
          if(!map.containsKey(i))
           map.put(i,1); 
           else{
               map.put(i, map.get(i)+1);
           }  
       }
    //    [-4,-1,-1,0,1,2]
       System.out.println(map);
        for (int i = 0; i < nums.length - 1; i++) {
            // System.out.println(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                // System.out.println(nums[j]);
                int value = -(nums[i] + nums[j]);
                System.out.println(value);                    
                if(map.containsKey(value)){
                    if(map.get(value)>1){

                        sub = new ArrayList<Integer>();
                        sub.add(nums[i]);
                        sub.add(nums[j]);
                        sub.add(value);
                        list.add(sub);
                    }
                }
            }
        }
        return list;
    }

  
    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> aa = new ArrayList<List<Integer>>();
        aa = Sum3(nums);
        System.out.println(aa);
    }
}
