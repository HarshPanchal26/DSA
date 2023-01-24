package dp;

public class coin {
    public static void main(String[] args) {
        int m =100 ;
         int result = Math.round(m/2) + Math.round(m/3) + Math.round(m/4);

         if(m>result)
          System.out.println(m);
          else{
              System.out.println(result);
              
        }
    }
}
