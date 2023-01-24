package patterns;

public class fish2 {
   
 public static void main(String[] args) {
        int N = 10;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k <= (N - 2) - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            for (int p = 0; p < i; p++) {
                System.out.print("* ");
            }

            for (int q = i + 1; q < N; q++) {
                System.out.print(" ");
            }
            // System.out.print("* ");
            for (int k = 0; k <= (N - 2) - i; k++) {
                // for(int k=0;k<(N-2)-1;k++){

                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        //  NOW , reverse upper code from here
       
        for (int i = N - 1; i > 0; i--) {

            for (int k=0;k<N-i;k++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }

            for(int p=0;p<i-1;p++){
                System.out.print("* ");
                
            }
            
            for(int q=0;q<N-i;q++){
                
                System.out.print(" ");
            }
            for (int k=0;k<N-i;k++) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }

            
            // System.out.print("* ");
            System.out.println();
        }

        
    }
}


