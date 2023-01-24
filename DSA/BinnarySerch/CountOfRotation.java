// not optimal for all the cases

package DSA.BinnarySerch;

public class CountOfRotation {
    public static void main(String[] args) {
        //  int array[] = {4,5,6,7,0,1,2};
         int array[] = {1,2,3};
         // int array[] = {4,4,10,4,5};
          int count = 1 + findCount(array);
          System.out.println(count);
    }
    public static int findCount(int array[]){
        int start = 0;
        int end = array.length-1;
        
        while(start<=end){
           int mid = start + (end-start)/2;
           if( mid<end && array[mid]>array[mid+1]) return mid;
           if( mid>start && array[mid-1]>array[mid]) return mid-1;
        //    if(array[mid]<=array[start]) return end=mid-1;
        //    else{
        //     return start=mid+1;
        //    }
           if(array[start]==array[mid] && array[mid]==array[end]){
            if( start!=array.length-1 && array[start]>array[start+1]){
                
                return start;
            }
            start++;
            if(end!=0 && array[end]<array[end-1]){

                return end;
            }
            end--;
        }
      else if(array[start]<array[mid] || array[start]==array[mid] && array[end]<array[mid]){
        start = mid+1;

      }else{
        end = mid-1;
      }
        }
        return -1;
    }
          
}
