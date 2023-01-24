package dp;
import java.util.ArrayList;
// import java.util.Arrays;

import java.util.Collections;


public class kthSumOfSubArray {
public static void main(String[] args) {
    // int array[] = {5,4,-8,6};
    int array[] = {3,-2,5};
    // Arrays.sort(array);
    ArrayList<Integer> list = new ArrayList<>();
    // int maxsum=0;
    for(int i=0;i<array.length;i++){
        int sum=0;
        for(int j=i;j<array.length;j++){
            sum = sum + array[j];
            list.add(sum);

        }
    }
    Collections.sort(list);
    System.out.println(list);
}    
    
}
