public class replace0with5 {
    
  public static int replace(int num){
   
    if(num==0) return 0;
    int digit = num%10;

    if(digit==0){
        digit=5;
    }

    return replace(num/10) * 10 + digit;
  }
    public static void main(String[] args) {
        int num = 00;
        if(num==0){
            System.out.println(5);
        }
        else
        System.out.println(replace(num));
    }
}


/*
 * 1020
 *  |
 * 102
 *  |
 * 10
 *  |
 *  1
 *  |
 *  0
 *
 *
 */