package dp;

public class maxproduct2 {
    
    public static int find(int array[]){
        int result = array[0];
        for(int i=0;i<array.length;i++){
              int p = array[i];
            for(int j=i+1;j<array.length;j++){
                
                result = Math.max(result, p);
                // System.out.println(p);
                p*=array[j];
            }
                result = Math.max(result, p);
        }
        return result;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,-4,0,6};
        // int array[] =  {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(find(array));
    }
}
// Time => O[n^2];
// space = > O[1]