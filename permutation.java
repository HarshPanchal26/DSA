

public class permutation {
   
    public static void printPerm(String str , String result) {
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);

            printPerm(newStr, result+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str,"");
    }
}
