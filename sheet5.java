public class sheet5{
    public static void chapoo(int p) {
        int count = 0;
        int n = 0 ;
         while(count<p){
            int elm = 5 *n +2 ;
            if(elm%4==0) continue;
            else {
                System.out.println(elm);
            }
            // System.out.println("");
            // System.out.println(count);
            
            n++;
            count++;
        }
    }
    public static void main(String[] args) {
        chapoo(10);
    }
}