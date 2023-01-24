

public class keypad {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx" ,"yz"};
    public static void createMessage(String str,int idx , String message){
        // System.out.println("harsh" + i);
        if(str.length()==idx){
            // System.out.println(message);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        
        for(int i=0;i<mapping.length();i++){
            createMessage(str, idx+1, message+mapping.charAt(i));
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String str = "19";
        createMessage(str,0,"");
        
    }
}
