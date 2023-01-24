package DSA.BinnarySerch;
/// you don't have length of array
public class Findelemnt {
    public static void main(String[] args){
        int array[] = {1,2,3,5,6,8,9};
        int target = 2;
        int start = 0;
        int end= 2;
        int idx= -1;
        while(idx==-1){
           idx = find(array, target,start,end);
           int newstart = end+1;
           end = (start+1)*2;
           start=newstart;
        }
      System.out.println(idx);
    }

    public static int find(int array[] , int target ,int start , int end){
        int pos = -1;
        while(start<=end){
           int mid = end - (end-start)/2;
           
           if(array[mid]>target) end=mid-1;
           else if(array[mid]<target) start = mid+1;
           else{
             pos = mid;
             return mid;
           }
         }
         return pos;
    }
}
