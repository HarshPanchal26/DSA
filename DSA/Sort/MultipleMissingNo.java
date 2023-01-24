package DSA.Sort;

import java.util.Arrays;
//               [1,3,5,7,9]
public class MultipleMissingNo {
    public static void main(String[] args) {
        // int array[] = { 2, 1, 2, 1 };
        int array[] = {5,4,3,2,1};
        cycle(array);/// where number is in range of [1 , N]
        System.out.println(Arrays.toString(array));
        for(int j=0;j<array.length;j++){
            if(array[j]!=j+1){
             System.out.print(j+1 + " ");
            }
        }
        
    }
    public static void cycle(int array[]){
       int i = 0 ;
       while(i<array.length){
        int correctidx = array[i] -1 ;
        if(array[i]<array.length && array[i]!=array[correctidx]){
            swap(array,i,correctidx);
        }else{
            i++;
        }
       }
    }
    public static void swap(int array[], int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}

