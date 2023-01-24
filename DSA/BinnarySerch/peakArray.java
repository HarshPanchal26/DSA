// bio tonic array or mountain array

package DSA.BinnarySerch;

public class peakArray {
    public static int findPeak(int[] array) {
        int start = 0;
        int n = array.length - 1;
        int end = n;
        while (start < end) {
            // int mid = end- (end-start)/2; // thid is not working for this program
            int mid = start + (end - start) / 2;
            if (array[mid] >= array[mid + 1])
            end = mid;
            // else if (array[mid] == array[mid + 1]) {
            //     // final int temp = mid;  
            //     if(mid+1==n){
            //        if(array[n]>array[0]){

            //        }
            //      }
            //} 
            else
                start = mid + 1;

        }
        return start;

    }

    public static void main(String[] args) {
        int array[] = { 0, 3, 2, 2, 2, 1 };
        int pos = findPeak(array);
        System.out.println(pos);
        System.out.println("dfv");
    }

}

// not a actual need to writr this
// if (start < 0 && mid < array.length - 1) {
// if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1])
// return mid;
// }