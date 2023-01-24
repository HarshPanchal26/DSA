package dp; 

class minimize{
  public static int find(int value){
    if(value ==1 ) return 1 ; 

    int result = find(value-1);
    if(value%2==0){
      
      result = Math.min(result, find(value/2));
    }
    
    if(value%3==0){
      
      result = Math.min(result,find(value/3));
    }
    

     return result+1;
  }
    public static void main(String[] args) {
    int value = 10 ;
    System.out.println(find(value));
}
}