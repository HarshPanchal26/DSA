package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class sum33 {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> list2 =new HashSet<>();
        List<Integer> sub = null;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        sub = new ArrayList<Integer>();
                        sub.add(nums[i]);
                        sub.add(nums[j]);
                        sub.add(nums[k]);
                        list2.add(sub);
                        System.out.println(sub);
                    }
                }

            }
        }
            list.addAll(list2);
        return list;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> aa = new ArrayList<List<Integer>>();
        aa = threeSum(nums);
        System.out.println(aa);
    }
}