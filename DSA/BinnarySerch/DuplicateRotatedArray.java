/*
 * pivot element :-- the idex which left and right both side are sorted in incrising order ;
 * 
 * same process as Search in rotated array but slite change bcz of duplication 
 */


package DSA.BinnarySerch;


class DuplicateRotatedArray {
    public static void main(String[] args) {
      //   int array[] = {4,5,6,7,0,1,2};
        int array[] = {4,4,10,4};
        int target = 10;
        int element = -1;
        // int array[] = {1,0,-1}; //  gine -1 ,bcz there is no pivot element if array is in increasing order
        int pivot = findPivot(array,0,array.length-1);
        System.out.println(pivot + "pivot");
        if(array[pivot]==target) {
            System.out.println( "hello " + pivot);
        }
        else{
           element = findElemnt(array,target,0,pivot);
          if(element==-1){
             element = findElemnt(array,target,pivot+1,array.length-1);
          }
        }
        System.out.println(element);
    }
     public static int findElemnt(int array[],int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(array[mid]<target) start=mid+1;
            if(array[mid]>target) end=mid-1;
            else{
                return mid;
            }
        }
        return -1;
     }
    public static int findPivot(int[] array, int start, int end){
       while(start<end){
         int mid = start + (end-start)/2;
         if(mid<end && array[mid]>array[mid+1]) 
         return mid;
         if(mid>start && array[mid]<array[mid-1])
         return mid-1;
        //  if(array[mid] <= array[start]) end=mid-1;
        //  else{
        //     start = mid+1;
        //  } 
         //if(start)

         if(array[mid]==array[start] && array[mid]==array[end]){

            if(array[start]>array[start+1]){
                return start;
            } // checking for pivot element
            start++;    
             
             if(array[end]<array[end-1]){
                 return end;
            }
            end--;
         }
         else if(array[start]<array[mid] || array[start]==array[mid] && array[mid]>array[end]){
            start = mid + 1; 
         }else{
            end=mid-1;
         }
       }
       return -1;
    }
}
