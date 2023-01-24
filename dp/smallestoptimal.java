package dp;

public class smallestoptimal {
    public static int findlargest(int []array){

        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){

            if(array[i]>large){
                sec_large=large;
                large=array[i];

            }else if(array[i]>sec_large && array[i]!=large){
                sec_large= array[i];
            }
        }
        return sec_large;
    }
   public static int findsmallest(int []array){

    int small= Integer.MAX_VALUE;
    int sec_small= Integer.MAX_VALUE;


    for(int i=0;i<array.length;i++){

      if(array[i]<small){
        sec_small = small  ;
        small = array[i];

      } 
      else if(array[i]<sec_small && array[i]!=small){
        sec_small=array[i];
      }        
    }
    return sec_small;
   }
    public static void main(String[] args) {
        int array[] = {2,5,1,3,0};
        System.out.println(findsmallest(array));
        System.out.println(findlargest(array));
    }
}
