package DSA.BinnarySerch;

public class MountainArray {
    
    public static int findElemnt(int array[] , int start , int end , int target){
       int pos =-1;
        while(start<end)
        {
           int mid=start + (end-start)/2;
           if(array[mid]>target)  end=mid-1;
           else if(array[mid]<target) start = mid+1;
           else 
              return pos=mid;

        }
        return pos;

     }
    public static int[] findPeak(int array[],int target){
        int start =0;
        int end = array.length-1;
        int r[] = new int[2];
            while(start<end){
            int mid = start + (end-start)/2;
            if(array[mid]>array[mid+1]) end = mid;
            
            else start = mid+1;

        }
        System.out.println(start);
        r[0] = findElemnt(array,0,start,target);
        r[1] = findElemnt(array,start,array.length-1,target);
        // System.out.println();

        return r;
        // if(start == target) return start;
    }
    public static void main(String[] args) {
        
            // int array[] = {0,2,2,2,3,1,1,0};
            int array[] = {0,1,2,3,1,2,0};
            int target = 2;
            int pos[] = findPeak(array,target);
           
            for (int i : pos) {
                System.out.print(i + " ");
            }
    }
}
