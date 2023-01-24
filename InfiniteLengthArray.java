public class InfiniteLengthArray {
    public static void main(String []args){
        int array[] = {10,191,200,409,413,777,800};
        int target = 10;
        int result = find(array,target);
        System.out.println(result);
    }
    public static int find(int array[],int target){

        int start = 0 ; 
        int end = 1 ;

        while(target>array[end]){
             start = end +1;
             end = end + (end-start+1)*2;
        }

        return search(array, target, start, end);
    }
    public static int search(int array[], int target , int start , int end){
        int ans = -1;
        // int start = 0 ;
        // int end = array.length-1;    
        while(start<=end){
            int mid = start + (end-start)/2;
    
            if(array[mid]>target) end = mid-1;
            else if(array[mid]<target) start = mid+1;
    
            else{
               ans = mid;
            }
        }
        return ans;
    }


}

