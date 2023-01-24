import java.lang.*;

public class fibo {

    public static void main(String[] args) {
        // Integer myint = INTEGER;
        int n = 8;
        Integer num = Integer.valueOf(n);
        Integer res = fibona(num);
        System.out.println(res);
    }

    public static Integer fibona(int n){

        if (n < 2)
            return n;

        return fibona(n - 1) + fibona(n - 2);
    }

}
