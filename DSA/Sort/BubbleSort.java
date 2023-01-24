package DSA.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        // int array[] = {5,3,2,1};
        int array[] = {1,2,3,4,5};
        for(int i=0;i<array.length-1;i++){
            boolean swap = false;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    swap = true;
                }
            }
            if(!swap){
                System.out.println("yes..");
                break;
            } 
        }
        for(int i=0;i<array.length;i++){

            System.out.print(array[i] + " ");
        }
    }
}
