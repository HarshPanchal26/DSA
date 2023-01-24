public class totalpath {
    public static int countPath(int n , int m , int i , int j){
        if(i == n-1 && j == n-1){
            return 1 ;
        }
        if(i == n || j == m){
            return 0 ;
        }
        
        //for downwords 
        int downwords = countPath(n, m, i, j+1);
        // for right most path 
        int right = countPath(n, m, i+1, j);

        return downwords + right; 
    }
    public static void main(String[] args) {
        int n= 4, m = 4;
        int totalpath = countPath(n,m,0,0);
        System.out.println(totalpath);
    }
}
