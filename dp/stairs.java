package dp;
public class stairs{
    public static int count(int n ){
         if(n==1){
            return 1;
         }
         if(n==0){
            return 0;
         }
         if(n==2){
            return 2;
         }
         int onestap = count(n-1);
         int twostap =count(n-2);

         return onestap + twostap;
    }
    public static void main(String[] args) {
        int count = count(3);
        System.out.println(count);
    }
}

// time - O(2^n);
// space - O(n);