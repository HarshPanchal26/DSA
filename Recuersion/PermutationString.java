package Recuersion;

public class PermutationString {
    public static void main(String[] args) {
        String str = "gee";
        printPermu(str, "");
    }
    public static void printPermu(String str, String ans){
        if(str.length()==0){
            System.out.println(ans + " ");
            return;
        }
        boolean array[]  = new boolean[26];
        for(int i=0;i<str.length();i++){
            
            char ch = str.charAt(i);
            // rest of the string
            String ros = str.substring(0, i) + str.substring(i+1);
            // System.out.println(ans);
            // System.out.println("rest of string " + ros);
            
            // for removing the duplicate element 
            if(!array[ch-'a']){
                printPermu(ros, ans+ch);
                array[ch-'a'] = true;

            }

        }
    }
}
 /*
                *     abc 
                bc   ac    ab 
            c       

  */


//    time complexity => O(N! * N)

//    space complexity => O(N) recuersion call space 