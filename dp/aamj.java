package dp;

public class aamj {
    public static int call(int n ){
        if(n==0) return 0;
        int result =0;

        for(int i=1;i<=5;i++ ){
            result=i+call(n-i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(call(5));
    }
}