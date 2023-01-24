package DSA.Sort;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        // int array[] = {5,4,3,2,1};
        int array[] = {5,4,2,1,};   // number should be in continuous order [for this algo .]
        int array2[] = {2,1,0}; 
        cycle(array);  // this only works for numbers which are in range of [1, N] ........ Ok 
        cycle2(array2);// this works for numbers in range of [0, N]
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
    public static void cycle2(int array[]){
        int i=0;
        while(i<array.length){
            int cidx =  array[i];
            if(array[i] < array.length && array[i]!=array[cidx]){
               swap(array, i, cidx);
            }else{
                i++;
            }
        }
    }
    public static void cycle(int array[]){
        // 5 2 1         
        int i=0;
        while(i<array.length){
            int correctidx = array[i]-1;
            if(array[i]< array.length && array[i] != array[correctidx]){
             swap(array,i,correctidx);
            }else{
                i++;
            }

        }
    }
    public static void swap(int array[] , int i , int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
