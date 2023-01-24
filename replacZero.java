// import java.util.ArrayList;
import java.util.Arrays;
// 'import java.util.ArrayList;



//       0  0  0
//       1  2  3         
//   0   4  0  4 -----> 
//   0   2  0  7

public class replacZero {
     public static void replace(int matrix[][],int m , int n){
        int i[] = new int[m];
        int j[] = new int[n];
        System.out.println(Arrays.toString(i));
        for(int p=0;p<m;p++){
          for(int q=0;q<n;q++){
            System.out.println(matrix[p][q]);
            if(matrix[p][q]==0){
                i[p]=1;
                j[q]=1;
                System.out.println(Arrays.toString(i));
                System.out.println(Arrays.toString(j));
                // System.out.print);
            // }
            }
        }
    }
    for(int p=0;p<m;p++){
        for(int q=0;q<n;q++){
            if(i[q]==1||j[p]==1){
                matrix[p][q]=0;
            }
        }
    }
    System.out.println(Arrays.toString(j));
        System.out.println(Arrays.deepToString(matrix));    
     }

    public static void main(String[] args) {
        int m=3,n=3;
        int matrix[][] = {{1, 0, 3}, {2, 0, 8},{1,0,9}};
        replace(matrix,m ,n);

        // System.out.println(Arrays.deepToString(arraylist1));

    }
}


//  time complexity O(m*n) 
//  space commplexity O(i+j)

/*
 *  0  1 0 5
 *  0  2 9 0
 *  0  3 9 2
 * 
 */