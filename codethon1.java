



public class codethon1 {
    public static void convertCode(String str){
       int l = str.length();
                        //   when given alphabet has a continous repetaed string 
       int idx=0; 
       int count=1;
       while(idx<=l-1){
          if( idx<l-1 && str.charAt(idx)==str.charAt(idx+1)){
           count++;
        }
        else{
            System.out.print( "" +(char)str.charAt(idx) + count);
            count=1;
        }
          idx++;
        }


                //  when string has a non-continous alphabet string 
            // int idx =0;    
            // HashMap<Character,Integer> map = new HashMap<>();
            // // Iterator hmIterator = map.entrySet().iterator()
            // while(idx<l){
            //     if(map.containsKey(str.charAt(idx))){
            //         map.put(str.charAt(idx) , map.get(str.charAt(idx))+1);
            //     }
            //     else{
            //         map.put(str.charAt(idx), 1);
            //     }
            // }
           
                
    }
    public static void main(String[] args) {
        String code = "2";
        // System.out.println(code.charAt(0));
         convertCode(code);

    }
}
