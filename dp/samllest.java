/// not of dynamic programming 
package dp;

public class samllest {
    public static int findsmallest(int array[]){
       /*  for samllsts element       
         int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
             min = Math.min(min, array[i]);

        } */
       
        // for larget elemnt in the array
        int dp[] = new int[array.length];
        System.out.println(dp);

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            max= Math.max(max, array[i]);
        }

        for(int i=0;i<array.length;i++)
        {
            if(array[i]==max) continue;
            sec_max = Math.max(sec_max, array[i]);
        }
     
        return sec_max;
    }
    public static void main(String[] args) {
        int array[] = {2,5,1,3,0};
        System.out.println(findsmallest(array));
    }
}
