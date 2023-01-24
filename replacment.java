import java.util.Arrays;

public class replacment {
 public static void replaceElement(int matrix[][] ,int i ,int j,int m , int n){
    if( i== m || j== n  ){
        System.out.println(Arrays.deepToString(matrix));
        return ;
    }
    if(matrix[i][j]==0){
        matrix[i][j+1]=0;
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("ji");
        replaceElement(matrix, i, j+1, m, n);
    }else{
        replaceElement(matrix, i+1, j, m, n);
    }
    return;
 }
    public static void main(String[] args) {
    int m=3 , n=3 ;
    // int matrix[][] = new int[m][n];
    int matrix[][] = {{1,2,3},{2,0,4},{3,4,5}};  

    replaceElement(matrix,0 ,0 ,m , n);
 }


}
