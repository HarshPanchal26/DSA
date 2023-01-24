import java.util.HashSet;

public class Longest {
    public static HashSet<String> lengthOfLongestSubstring( String str,int idx,String newStr, HashSet<String> set){
        if(str.length()-1==idx){
            if(set.contains(newStr)){
                System.out.println(set);
                return set;
            }
        }
                set.add(newStr);
                System.out.println(newStr);
                char currChar = str.charAt(idx);
                lengthOfLongestSubstring(str,idx+1,newStr+currChar,set);
                lengthOfLongestSubstring(str,idx+1,newStr,set);
            return set;
        
        // return set;
    }
    public static void main(String []args){
        String str = "abcabcbb";
        HashSet<String> set = new HashSet<>();
        HashSet<String> answer = lengthOfLongestSubstring(str,0,"",set);  

        System.out.println(answer);
    }
}
