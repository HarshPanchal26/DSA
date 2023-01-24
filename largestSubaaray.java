import java.util.ArrayList;

public class largestSubaaray {
    public static int f(int array[], ArrayList<Integer> list) {
       
       // kadane's algorithm tp find subarray 

       int max = Integer.MIN_VALUE;
       int sum=0;
       int j=0;
       for(int i=0;i<array.length;i++){
         sum+=array[i];

         if(sum>max){
            list.clear();
            max=sum;
            list.add(j);
            list.add(i);
         }
         if(sum<0){
            sum=0;
            j=i+1;
         }
       }
        
       return max;

       // O(N) time complexity  
       
       
       
       
       
        // int max = Integer.MIN_VALUE;
        // int n = array.length;

        // for (int i = 0; i < n; i++) {
        //     int sum = array[i];
        //     for (int j = i+1; j < n; j++) {
        //         sum += array[j];
        //         if (sum > max) {
        //             list.clear();
        //             max = sum;
        //             list.add(i);
        //             list.add(j);
        //             System.out.println(list);
        //         }
        //     }
        // }
        // return max;
        // time complexity === O(N^2) 
    }

    public static void main(String[] args) {
        // int array[] = {-2,1,-3,4,-1,2,1,-5,4};
        int array[] = {-2,-10,-2,-3};
        ArrayList<Integer> list = new ArrayList<>();
        int sum = f(array, list);
        System.out.println(sum);
        // for (Integer integer : list) {
        //     System.out.print(integer);
        // }
        for(int i=list.get(0);i<=list.get(1);i++){
            System.out.print(array[i] + " ");
        }
    }
}
