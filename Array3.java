public class Array3 {
    public static void main(String[] args) {
        int array1[] = { 11, 42, 25, 58, 10 };  
        int array2[] = { 61, 29, 25, 23, 53, 6, 6 };
        int array3[] = { 92, 73, 26, 26 };
        int minal = Integer.MAX_VALUE;
        for (int i = 0; i < array3.length; i++) {
            int first = array3[i];
            int res = 0;
            for (int j = 0; j < array1.length; j++) {
                int sec = array1[j];
                for (int k = 0; k < array2.length; k++) {
                    int theird = array2[k];

                    int max = Math.max(first, Math.max(sec, theird));
                    int min = Math.min(first, Math.min(sec, theird));
                    res = max - min;
                    minal = Math.min(minal, res);

                }


            }
        }
        System.out.println(minal);
    }
}
