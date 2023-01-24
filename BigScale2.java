public class BigScale2 {
    public static void main(String[] args) {
        String str = "a3b10c1";
        int i = 0;
        int j = 0;
        goAndDo(str);
        while (i < str.length() || j < str.length()) {
            // String count = "";
            char c = str.charAt(i);
            if ((int) c < 10) {
                String total = "" + str.charAt(j);
                j++;
                while ((int) j < 10) {
                    total = total + str.charAt(j);
                    j++;
                }
                for(int k=0;k<Integer.parseInt(total);k++){
                    System.out.print(c);
                }
                i = j + 1;
            } else {
                j++;
                i++;
            }
        }
    }
    public static void goAndDo(String str){
        // a3b10

        int i = 0;

        while(i<str.length()){

            char c = str.charAt(i);

            // if()
        }
    }
}
