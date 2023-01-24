// IMPORTANT 

package Recuersion;

public class ReverseNumber {
    public static int sum = 0;
    public static void main(String[] args) {
        int num = reverse(0123);
        reverse2(0123);
        System.out.println(num);
        System.out.println(sum);
    }
    public static int reverse(int number){
        int digits = (int)Math.log10(number) + 1 ;
        return helper(number, digits);
    }
    public static int helper(int num , int digits){

        if(num%10==num){
            return num;
        }

        int rem = num%10;
        return rem*(int)Math.pow(10, digits-1) + helper(num/10, digits-1);
    }
    public static void reverse2(int num){
        if(num==0){
            return; 
        }
        //  System.out.println("num is" +num);
        int remn = num % 10;
        // System.out.println( "is  "+ remn);
        sum = (sum*10) + remn;
        // System.out.println(sum);
        reverse2(num/10); 
    }
}
