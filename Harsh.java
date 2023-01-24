// import java.util.ArrayList;


public class Harsh {
public static void printing(int n){
    // int i = 0;  
    int count = 0 ;
    while(count<n){
          int elm =5*count+2;
          System.out.println(elm);
          if(elm%4==0)
          continue;
          else{
              System.out.println(elm);
            }
     count++;
     System.out.println(count);

    }
}
  public static void main(String[] args) {
    printing(5);
  }
}