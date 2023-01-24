/*
 * Bitiwse operations
 * 
 * and ==> &
 * or ==> OR
 * compliment = ~
 * XOR == > ^ 
 * left shift ==> 
 *       example :  n = 100 ==> 4
 *                  n << 1
 *                  now new n = 1000 ==> 8 (n)
 *           
 */
package DSA;

public class Bites {
    public static void main(String[] args) {
        int n = 16;
        int passcale = 5;
        // int array[] = {1,1,3,4,5,6,3,5,4};
        int array[] = {1,1,3,4,4};
        leftShift(n);
        rightShift(n);
        compliment(n);
        and(n);
        oddOrEven(n);
        // every number apperas twice only one of the number is appers single time find that number
        findNumber(array);

        // find i th  bit of number
        findBit(n , 1);

        // set i th bit (if it is 0 then set it to 1)

        setBit(n,2);

        // find the first right most set bit
        findSetBit(n);

        //  find the magic number 
        findMagic(n);

        // find the number of digits to represent binnary form

        NoofDigits(n);

        // find the sum of n'th row of passcale triangle

        findSumPas(passcale);

        // chechk whether the number is equal to power of two or not 

        isNum(n);

        // ImP ====>  multiply the number base times

        multiply(3,6); // 0(logb) where b is power 


        // numer of set bits for any numbers

        numOfSetBits(n);

    }

    
    public static void numOfSetBits(int n) {
       //   aaaa samaj nathi padi 
        int count = 0;
        while(n>0){
            count++;
            n-=(n & (-n));
        }
        System.out.println("Number of set bits are ==> " + count );
        // System.out.println(Integer.toBinaryString(n));
    }


    public static void NoofDigits(int n){
        int base = 2; 
        int digits = (int)(Math.log(n)/Math.log(base)) +1;
        System.out.println( "Number of bits in binnary represantation is " + digits);
        // this shows how many times you have to multiply number 2 for getting number n , which is simillar to number of bits 
    }
    public static void leftShift(int n){
      System.out.print("left shift is : ");
      System.out.println(n<<1);
    }
    public static void rightShift(int n){
        System.out.print("Right shift is : ");
        System.out.println(n>>1);

      }
    public static void compliment( int n){
        System.out.print("compliment is : ");
        System.out.println(~n);

      }
    public static void and( int n){
        System.out.print("AND is : ");
        System.out.println(n&1);

      }
    public static void oddOrEven( int n){
        if(n==0){
            System.out.println("Number is zero");
            return;
        }
        int x = n & 1;
        if(x==1)
        System.out.println("Number is odd");
        else 
        System.out.println("Number is even");
    }

    public static void findNumber(int array[]){
        int x = 0;
        for(int i=0;i<array.length;i++){
             x^=array[i]; 
            //  System.out.println(x);
        }
        System.out.println(x + "  number has single appearance");
    }

    public static void findBit(int n , int b){

        int mask = 1<<(b-1);
        int bit = mask&n>>(b-1);
        System.out.println("i'th bit is " + bit);
    }

    public static void setBit(int n , int b){
        int mask = 1<<(n-1);
         n = n & (~mask) ;
        System.out.println("===>" + n);
        // System.out.println("this is not working i don't know why ! plz find it ");
    }

    public static void findSetBit(int n){
        int setbit = 0;
        int i = 1;
        while(n>0){
           int ans = n&1;
            if(ans==1){
                setbit = i;
                System.out.println("first set bit (Right most) is " + setbit);
                return;
            }else {
                i++;
                n = n>>1;
            }
        }
        System.out.println("first set bit (Right most) is " + setbit);
    }

    public static void findMagic(int n){
       /*
        * time complexity is ==> 
        */
       
        int j = n;
        int base = 5 ;
        int ans = 0 ;
        while(n>0){
            int last = n & 1;
            n= n >> 1; // right shift by 1 
            ans += base*last;
            base*=5;
        }
    System.out.println(j +" th magic number is " + ans);
    }
    
    public static void findSumPas(int n){
         /*
          *  1 
             sum of each row is ==> 2^n;

          */ 
          
    }

    public static void isNum(int n){
      boolean res = ( n & (n-1))==0;
      System.out.println(res);
      /*
       * 16 ==> 10000 ==> 1111+1;  
       * 8 ==> 1000 ==> 111 + 1; 
       */
    }    

    public static void multiply(int base, int power){
      
        int ans = 1;
        while(power>0){
            if( (power&1)==1){
               ans*=base;
            }
            base*=base;
            power>>=1;
        }
    System.out.println("Answer is " + ans);  /// time complexity ==> (O(log(power)))
    }
}
// n & (-n) gives me right most set bit 



// check last 3 question of DSA playlist video no ==25