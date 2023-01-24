import java.util.ArrayList;
import java.util.List;

public class pascle2 {
    public static List<List<Integer>> findpascael(int number){
       List<List<Integer>> main = new ArrayList<List<Integer>>();
       List<Integer> prev , next = null;
       for(int i=0;i<5;i++){
           for(int j=0;j<=i;j++){
               prev = new ArrayList<>();
            next = new ArrayList<>();
            if(j==0||j==i) {
                next.add(1);
               
            }else{
                if(j>=1)              
                next.add(prev.get(j-1)+prev.get(j)); 
            }
            prev = next ;
            main.add(next);
        }
    }
    return main;      
    }
    public static void main(String[] args) {
        int number = 5 ;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result = findpascael(number);
        System.out.println(result);
    }
}
