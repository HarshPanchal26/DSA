package DSA.BinnarySerch;

import java.util.Arrays;

public class PivotIn2d {

    
    
    public static int[] find(int array[][], int row){
         
        // int row = 1;
        while(row<array.length-2){
            
            int pivot = findPivot(array,row);
            
            if(array[row][pivot]>array[row-1][pivot] && array[row][pivot]>array[row+1][pivot]){
                System.out.println("hello");
                return new int[] {row,pivot};
            }
            else {
            row++;
        }
       }
       return new int[] {0,0};
    }

    public static int findPivot(int array[][] , int row){
        int start = 1;
        int end = array[0].length-2;

        while(start<array[0].length-2){
            int mid = start + (end-start)/2;

            if(array[row][mid]>=array[row][mid+1]) end = mid;
            else start=mid+1;
        }
        return start;
    }
    public static void main(String[] args) {
        int array[][] = {{-1,-1,-1,-1,-1},
                         {-1,10,20,15-1},
                         {-1,21,30,14,-1},
                         {-1,7,16,32,-1},
                         {-1,-1,-1,-1,-1} };
       int result[] = find(array, 1);
       System.out.println(Arrays.toString(result));
    }
}
