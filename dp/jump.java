
// gives wrong answers ............................


package dp;

public class jump {
    public static int find(int array[], int idx) {
        if ( idx >= array.length)
            return 1;
        if (array[idx] == 0)
            return 0;
        int maxjump = 1;
        int minjump = Integer.MAX_VALUE;
        

            for (int i = 1; i <array[idx]; i++) {
                if(idx<array.length){
                    maxjump = maxjump + find(array, idx+i);
                    minjump = Math.min(maxjump, minjump);
                }
            }
        
        return maxjump;
    }

    public static void main(String[] args) {
        int nums[] = {1,0,1};
        System.out.println(find(nums, 0));
    }
}
