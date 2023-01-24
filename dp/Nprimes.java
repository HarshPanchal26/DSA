package dp;

import java.util.ArrayList;
import java.util.List;


public class Nprimes {
    public static boolean isPrime(int n){
       if(n==0||n==1) return false ;
        for(int i=2;i*i<=n;i++){
            
            if(n%i==0) return false ;

        }
        return true ;
    }

    public static int findNumber(List<Integer> list, int target, int count ){
        
        if(target==0) return count;

          
        for(int i=0;i<list.size();i++){
            //take a number  
            findNumber(list, target-list.get(i),count+1);
            
            //not to take a number 

            findNumber(list, target, count);    
             
        }

        return count;
    }
    public static void main(String[] args) {
        int primeno = 5 ;
        int target = 15;
        int j=1;
        // int array[] = new int[primeno];
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<100;i++){
            if(j>primeno) break;
            boolean result = isPrime(i);
            if(result){
            // array[j++ - 1] = i;
            list.add(i);
            j++;
          }
        }
        // for (int i : array) {
        //     System.out.println(i);
            
        // }
        int total = findNumber(list,target,0);
        System.out.println(total);
    }
}
