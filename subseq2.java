import java.util.HashSet;

public class subseq2 {
    public static void subsquence(String str ,int idx, HashSet<String> set ,String newStr ){
        if(idx==str.length()){
            if(set.contains(newStr)){
                return ; 
            }
            else{

                set.add(newStr);

                char currChar = str.charAt(idx);
// to be syso
              subsquence(str, idx+1, set, newStr+currChar);
              // not to be 
              subsquence(str, idx+1, set, newStr);
              
              System.out.println(newStr);
            }
            return ;
        }
    }
   
    public static void main(String[] args) {
       HashSet<String> set = new HashSet<>();
        String str= "abbbbdc";
      subsquence(str,0,set,"");  
    }
}
