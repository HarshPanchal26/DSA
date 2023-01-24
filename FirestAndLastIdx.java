public class FirestAndLastIdx {
   
   public static int search(int array[], int target , boolean findStratIndex){
    int ans = -1;
    int start = 0 ;
    int end = array.length-1;
    while(start<=end){
        int mid = start + (end-start)/2;

        if(array[mid]>target) end = mid-1;
        else if(array[mid]<target) start = mid+1;

        else{
           ans = mid;
           if(findStratIndex) end = mid-1;
           
           else start = mid+1;
        }
    }
    return ans;
}
   
    public static void main(String[] args) {
    int array[] = {5,7,7,8,8,10};
    int result[] = {-1,1};
    int target = 1;
    int start = search(array,target,true);
    int end  = search(array,target,false);

    result[0] = start;
    result[1] = end;

    for (int i : result) {
        System.out.println(i);
    }

    }
}

// time complexity = O(logN) + O(logN) = O(logN);
// space compelxity = O(N)