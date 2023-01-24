import java.util.Arrays;
import java.util.*;
public class dryrun {
    public static void main(String[] args) {
        // int [][] arr = {{3,2,1},{4,3,2}};
        String  [] arr = {"harsh", "amanan"};
        Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        for(String i : arr){
            // for(int j : arr[i]){
                
                System.out.println(i);
            
        }
        System.out.println(arr);

        
    }
}
