public class sub2 {
     public static boolean[] map = new boolean[26];
    public static void removeDulicates(String str, int idx, String newString) {
        
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            removeDulicates(str, idx+1, newString);
        }else{ 
            map[currChar-'a']=true;
            removeDulicates(str, idx+1, newString+currChar);

        }
    }
    public static void main(String[] args) {
     String str = "abcdeass";
     removeDulicates(str,0,"");    
    }
}
