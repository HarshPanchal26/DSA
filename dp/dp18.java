package dp;

public class dp18 {
    public static int findNumberOfSubset(int array[] , int diff , int idx){
        
        if(idx==0){
             if(diff==0 && array[idx]==0 ) return 2 ;
             if(diff==0 && diff==array[0]) return 1;
             return 0;
            }  
        // System.out.println(diff);
        int pick = 0 ;
        if(array[idx]<=diff) pick+=findNumberOfSubset(array, diff-array[idx], idx-1);

        int notpick = findNumberOfSubset(array, diff, idx-1);

        return pick+notpick;
    }
    public static void main(String[] args) {
        int array[] = {1,3,2};
        int d = 1;
        int totalsum = 0;
        for (int i : array) {
            totalsum+=i;
        }
        int result = findNumberOfSubset(array,(totalsum-d)/2,array.length-1);
        System.out.println(result);
    }
}
