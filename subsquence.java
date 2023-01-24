// import java.sql.Struct;
// import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

// import java.io.*;

public class subsquence {
    public static HashSet<String> subseq(String str, int idx , String newstr , HashSet<String> sub){
       if(idx == str.length()){
        if(sub.contains(newstr)){
            return null;
        }else{
            
            
                sub.add(newstr);
                System.out.println(newstr);
                
                return sub;
                // Object obj = Collection.max(newstr);
            }
        }
        char currChar = str.charAt(idx);
        subseq(str, idx+1, newstr+currChar,sub);
        
        subseq(str, idx+1, newstr,sub);
        return sub;
        
        
        // System.out.println("hello");
    }
    
    
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set2 = subseq("aaaaaab", 0, "", set);
         Object obj = Collections.max(set2);
        System.out.println(obj);
       }
}
