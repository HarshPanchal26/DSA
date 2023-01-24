package DSA.Sort;

public class selectionSort {
    
    public static void SelectionSort(int array[]){
        for(int i=0;i<=array.length-1;i++){
            int max = maximum(array,array.length-i-1);
            swap(max,array.length-i-1,array);  
        }
        for(int i=0;i<=array.length-1;i++){
            System.out.print(array[i] + " ");
        }
    }
    public static int maximum(int array[],int end){
        int max = 0;
        for(int i=1;i<=end;i++){
           if(array[max]<array[i]){
            max=i;
           }
        }
        return max;
    }
    public static void swap(int a, int b, int array[]){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    public static void main(String[] args) {
        int array[] = {5,3,2,1,6};
        // int array[] = {2,1};
        SelectionSort(array);
    }
}


// time complexity ==> O(n)