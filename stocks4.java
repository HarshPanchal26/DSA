public class stocks4 {
    public static int price(int array[]){
      int min = Integer.MAX_VALUE;
      int max = 0 ;
      for(int i=0; i < array.length;i++){
        min = Math.min(min, array[i]);
        if(min<array[i])
        max = Math.max(max, array[i]- min);
      }
      return max;
    }
    public static void main(String[] args) {
        int array[] = {7,1,5,3,6,4};
        int result = price(array);
        System.out.println(result);
    }
}
