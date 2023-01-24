package DSA.BinnarySerch;

public class FirstAndLastIndex {
         
          
    public static void main(String[] args) {
     // write inputs here 
     int array[] = {1,2,2,4,5,5,5,5};
     int target = 5;
     int range[] = searchRange(array,target);
     for (int i : range) {
        System.out.print(i + " ");
     }
     System.out.println();
     System.out.println("count of elemnt " + ((range[1]-range[0])+1));

    }
        public  static int[] searchRange(int[] nums, int target) {
            int array[] = {-1,-1};
             if(nums.length==0){
                 return array;
             }
            array[0] = find(nums,target,true);
            if(array[0]!=-1)
            array[1] = find(nums,target,false);
    
            return array;
        }
        public  static  int find(int array[], int target , boolean forFirstIndex){
            int start = 0;
            int last = array.length-1;
            int ans =-1 ;
    
            while(start<=last){
    
                int mid = start + (last-start)/2;
                
                // int mid = last - (last-start)/2;
    
                if(target>array[mid]) start=mid+1;
    
                else if(target<array[mid]) last = mid-1;
    
                else{
                 ans = mid;
                if(forFirstIndex){
                    last=mid-1;
                }else {
                    start = mid+1;
                }
                }
            }
           return ans;
        }
    }

