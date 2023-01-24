import java.util.HashSet;

public class Example1 {
    public static void SubSeq(String str, int idx, String newstr){
        HashSet<Character> set = new HashSet<>();
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
         
        //  want to be add 
        System.out.println("step 1");
        SubSeq(str, idx+1, newstr+currChar);
        //  not to be 
        System.out.println("step 2");
        SubSeq(str, idx+1, newstr);
        return;
    }
    public static void main(String[] args) {
        String str = "acd";
        SubSeq(str,0,"");
    }
}
