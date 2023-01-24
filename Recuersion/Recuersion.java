package Recuersion;

// import javax.swing.plaf.synth.SynthOptionPaneUI;

// public class Recuersion {
//     static int res = 0;
//    public static int cretae(int n ) {
//     if(n==0){
//         return 0;
//     }
//     // System.out.println(n);
//      res = n + cretae(n-1);
//          System.out.println(res);
//      return res;    
//     }
//     public static void main(String[] args) {
//         int sum = cretae(4);
//          System.out.println(sum);
//    }  
// }
  

// public class Recuersion {
    
//    public static void  cretae(int i, int n , int sum  ) {
//     if(n==i){
//         sum+=i;
//         System.out.println(sum);
//         return ;
//     }
//     sum += i;
//     System.out.println(sum);
//      cretae(i+1,n,sum);
//     }
//     public static void main(String[] args) {
//          cretae(1, 4,0);
         
//    }  
// }


//  febonaci seris 

public class Recuersion{
     static void fibonaci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c); 
        fibonaci(b, c, n-1);
     }
    public static void main(String[] args) {
        int a=0 , b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 10 ;
        fibonaci(a,b,n-2);
    }
}