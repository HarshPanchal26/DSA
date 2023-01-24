package dp;

public class minimumJump {
public static int findMinimunJump(int array[], int idx,int sum ){
    if(idx>array.length-1) return sum;
    
    if(array[idx]==0) return -1;
    
     int res = Integer.MAX_VALUE;
     for(int i=1;i<=array[idx];i++){
        if(array[idx]!=0)
        res = Math.min(res, findMinimunJump(array, idx+i, sum+1));
        System.out.println(res);
     }
     return res;
    
  
}
    public static void main(String[] args) {
    int array[]= {4 ,1, 7, 10, 3, 7, 8, 3, 7};
    // int[] dp = new int[]
    int result = findMinimunJump(array,0,0);
    System.out.println("output is" + " "  + result);
}    
}

//greeady approch 

        // public int jump(int[] A) {
        //     int jumps = 0, curEnd = 0, curFarthest = 0;
        //     for (int i = 0; i < A.length - 1; i++) {
        //         curFarthest = Math.max(curFarthest, i + A[i]);
        //         if (i == curEnd) {
        //             jumps++;
        //             curEnd = curFarthest;
        //         }
        //     }
        //     return jumps;
        // }        




    // public static int minJumps(int[] a, int currentIndex, int sum) {
    //         if (currentIndex >= a.length - 1)
    //             return sum;

    //         int res = Integer.MAX_VALUE;
    //         for (int i = 1; i <= a[currentIndex]; i++) {
    //             res = Math.min(res, minJumps(a, i + currentIndex, sum + 1));
    //         }
    //         return res;
        