package patterns;

class fish {
 public static void main(String[] args) {
        int N = 5;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k <= (N - 2) - i; k++) {
                // for(int k=0;k<(N-2)-1;k++){

                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int p = 0; p < i; p++) {
                System.out.print("*");
            }

            for (int q = i + 1; q < N; q++) {
                System.out.print(" ");
            }
            // System.out.print("*");
            for (int k = 0; k <= (N - 2) - i; k++) {
                // for(int k=0;k<(N-2)-1;k++){

                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // reverse upper code from here
        // System.out.println();
        for (int i = N - 1; i > 0; i--) {

            for (int k = i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
