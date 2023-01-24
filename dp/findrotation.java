package dp;

public class findrotation {
    public static int find(int[] array){
        // int min= Integer.MAX_VALUE;
        if ( array == null || array.length == 0 ) return -1; // null or empty

        int largest = 0;
        for ( int i = 1; i < array.length; i++ )
        {
            if ( array[i] < array[largest] ) largest = i;
        }
        return largest;
    }
    public static void main(String[] args) {
        int array[] = {4,5,6,7,0,1,2};
        System.out.println(find(array)); 
    }
}
