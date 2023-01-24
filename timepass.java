import java.util.ArrayList;

public class timepass {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
    int array[] = new int[n];
        int dp[] = new int[2];
        for(int i=0;i<n;i++){
            array[i] =0;
        }
    for(int i=1;i<=n;i++){
        if(arr.contains(i)){
            array[i-1]=array[i-1]+1;
            
        }else{
            dp[0] = i;
        }
        }
        
        for(int i=0;i<n;i++){
            if(array[i]==2) dp[2]=i+1;
        }
        return dp;
    }
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(4);
    list.add(5);
    int result [] = missingAndRepeating(list, 5);
    for (int i : result) {
        System.out.println(i);
    }
   }
}
