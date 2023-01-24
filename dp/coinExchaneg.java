package dp;

public class coinExchaneg {
    
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            int position = 0;
            int k= 21;
            if(k!=0){
            int frwdStep = k/2 ;
            if(k%2!=0) frwdStep+=1;
            // System.out.println(frwdStep);
            int backstep = k-frwdStep;
            // System.out.println(backstep);
            position = 3*frwdStep - backstep;
        }
            System.out.println(position);
            
            
         }
    
    
}
