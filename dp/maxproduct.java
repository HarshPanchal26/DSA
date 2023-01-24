


                                                     //// wrong ////
package dp;

public class maxproduct {
  public static int findproduct(int array[], int i){
    
     if(i==array.length-1) return array[i];

    int max = Integer.MIN_VALUE;
    int result  = array[i] * findproduct(array, array[i+1]);
      max=Math.max(max, result);


    return max;
  }
  
  public static int find(int array[]){
    int max = Integer.MIN_VALUE;
    for(int i=0;i<array.length;i++){
       int product  =  findproduct(array,i);

       max = Math.max(max, product);
    }
    return max;
  }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,0};
        System.out.println(find(array));
;    }
}
