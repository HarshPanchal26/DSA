// optimze approch 

package dp;

public class jump2 {
    
    public static void main(String[] args) {
        int array[] = {2,3,1,1,4};   
        int minjump = Integer.MAX_VALUE;
        int maxjump = 1;
        for(int i=0;i<array.length;i++){
            for(int j=1;j<array[i];j++){
                if((i+j) <= array.length-1){

                    maxjump = maxjump + array[i+j];
                    minjump = Math.min(maxjump, minjump);
                }
            }
        }
        System.out.println(minjump);
        
    }
}
