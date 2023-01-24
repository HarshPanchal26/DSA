/*
 * pivot element :-- the idex which left and right both side are sorted in incrising order ;
 */


package DSA.BinnarySerch;


class SearchInRotatedArray {
    public static void main(String[] args) {
      //   int array[] = {4,5,6,7,0,1,2};
        int array[] = {4,4,4,10};
        int target = 10;
        int element = -1;
        // int array[] = {1,0,-1}; //  gine -1 ,bcz there is no pivot element if array is in increasing order
        int pivot = findPivot(array,0,array.length-1);
        System.out.println(pivot);
        if(array[pivot]==target) System.out.println(pivot);
        else{
           element = findElemnt(array,target,0,pivot-1);
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
         if(array[mid] <= array[start]) end=mid-1;
         else{
            start = mid+1;
         } 
         //if(start)
       }
      
       return -1;
    }
}
