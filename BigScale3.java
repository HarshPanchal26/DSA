import java.util.ArrayList;
import java.util.List;

// peloendrom number between given range 

public class BigScale3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 50;
        find(start,end,list);
        // System.out.println(list);
    }
    // public static void find(int start , int end , List<Integer> list){
    // for(int i=start;i<=end;i++){
    //     if(i/10==0){
    //       list.add(i);
    //     //   System.out.println(list);
    //     }
    //     else{
    //         System.out.println("hello");
    //         String str = Integer.toString(i);
    //         System.out.println(str);
    //         boolean result = check(str);
    //         System.out.println(result);
    //         if(result){
    //             list.add(i);
    //             System.out.println(list);
    //         }
    //     }
    // }
    // System.out.println(list);
    // }
    // public static boolean check(String str){
    //     int i = 0;
    //     int j = str.length()-1;
    //     boolean res = false;
    //     while(i<j){
    //       if(str.charAt(i)==str.charAt(j)){
    //         res = true;
    //       }else{
    //         return false;
    //       }
    //     }
    //     return res;
    // }


    public static void find(int start, int end , List<Integer> list){

        for(int i=start;i<=end;i++){
            int n = i;
            int rev = 0;
            while(n>0){
                // System.out.println(n);   
                int remender = n%10;
                rev = rev + remender;
                n=n/10;

            }
                if(rev==i){
                    // list.add(i);
                    System.out.println(i + " ");    
                }
        }
    }
}

//   0  1   2  3  4   5   6 
//  -1 ,2 ,-3, 5, -4, 5, -6 