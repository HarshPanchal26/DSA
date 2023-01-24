package dp;

// import java.lang.FdLibm.Pow;

// import java.util.Arrays;

public class ninjachocolate {
   
    public static int pickup(int[][] array , int n , int m , int i , int j1 , int j2){
      
      if(j1<0||j1>=m||j2<0||j2>=m) return (int)Math.pow(-10, 9);
      
      if(i==n-1){
        if(j1==j2)
        return array[i][j1];
        else 
        return array[i][j1] + array[i][j2];
        
      }
       int maxi = Integer.MIN_VALUE;
      for(int d1 =-1 ; d1 <=1 ; d1 ++){
        for(int d2 = -1 ; d2 <=1 ; d2 ++){
           int ans;
          if(j1==j2)
           ans = array[i][j1] + pickup(array, n, m, i+1, j1+d1, j2+d2);
           else 
           ans = array[i][j1] + array[i][j2] + pickup(array, n, m, i+1, j1+d1, j2+d2);

           maxi  = Math.max(ans, maxi);
        }
      }
      return maxi ; 

    }
    public static void main(String[] args) {
        int choco[][] = {{2,3,1,2},
                         {3,4,2,2,},
                         {5,6,3,5}};
        int n = choco.length;
        int m = choco[0].length;
        System.out.println(pickup(choco, n-1, m-1, 0 , 0 , m-1));
    }
}
