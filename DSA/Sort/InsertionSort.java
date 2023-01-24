package DSA.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // int array[] = {5,4,2,1,5};
        int array[] = {0,1,-1,11,-2}    ;
        insertion(array);
        System.out.println(Arrays.toString(array));
        // for (int i : array) {
        //     System.out.print(i + " "); 
        // }
    }
    public static void insertion(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    swap(array ,j,j-1);
                }else{
                    break;
                }
            }
        }
       
    }
    public static void swap( int array[] ,int a, int b){
      int tmp = array[a];
      array[a] = array[b];
      array[b] = tmp;

    }
}
// time complexity => O(N^2)