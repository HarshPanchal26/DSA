
// import java.lang.Thread.State;
// import java.util.*;
import java.util.Scanner;


public class bulb {
    public static void main(String []args){
       int result = 0; 
       try (Scanner sc = new Scanner(System.in)) {   // no need of try block you cna remove it , i just do it bcz vs code show me a warning ans suggestion to do it 
        System.out.println("enter the number of test case");
          int test = sc.nextInt();
          System.out.println("");
          System.out.println("first");
        //   for(int i=0 ; i< test ; i++){
             while(test>0){
              System.out.println("enter the number of switches");
              int button = sc.nextInt();
              System.out.println("State of switches");
              String state  = sc.nextLine();
              System.out.println("secoend");
            //   for(int j =1 ;j <= button ; j++){
                while(button>0){
            
               System.out.println("third");
                  
                //   int switch = sc.nextInt();
                   result = result + (int)state.charAt(button);
                   
                  button--;
                }
                if(result%2==0){
                    System.out.println(1);
                    result =1 ;
                    System.out.println("thierd");
                }
                else{
                    System.out.println(0);
                    result =1 ;
                }

               test--;

            }
    }


      
      
    }
}
