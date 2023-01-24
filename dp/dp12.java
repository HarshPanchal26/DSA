package dp;


public class dp12 {
    public static int fun2(int i , int j , int m , int array[][]){
    

        // if(j<0||j>=m) return (int)Math.pow(-10, 9);  
        if(j<0||j>=m) return 1;

        if(i==0) return array[i][j];

        int up = array[i][j] + fun2(i-1, j, m, array);
        int left = array[i][j] + fun2(i-1, j-1, m, array);
        int right = array[i][j] + fun2(i-1, j+1, m, array);
       return Math.max(up, Math.max(left, right));    
    }
      
    
    public static int fun1(int array[][]){
        int n = array.length;
        int m = array[0].length;

        int maxi =  Integer.MIN_VALUE;
        for(int j=0;j<m;j++){
           int ans =  fun2(n-1,j,m,array);
           maxi = Math.max(ans, maxi);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int array[][] = {{1,2,10},
                    {100,3,2,1},
                    {1,20,2},
                    {1,2,2,1}};
    System.out.println(array[0].length); //4
    System.out.println(fun1(array));
    }
}
