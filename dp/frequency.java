package dp;
import java.util.Arrays;
public class frequency {
    public static void count(int []array){
        boolean[] visited = new boolean[array.length];
        for(int i=0;i<array.length-1;i++){
            if (visited[i] == true)
            continue;
            
            int count = 1;
            for(int j=i+1;j<array.length;j++){
                
                  if(array[i]==array[j]){
                      count++;
                      visited[j]=true;
                      
                    }
             
            }
            System.out.println("elemnt " + array[i]+ "appears " + count + "time");
        
           
        }
        // System.out.println(Arrays.toString());
        System.out.println(Arrays.toString(visited));
    }
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        count(arr);
        
    }
}

/*
 * 
 *   Hashset<Integer,Integer> set = Hashset<Integer,Integer>();
 * for(int i 0 to array.lenght){
 * if(set.containsKey(array[i])){
 *   map.put(array[i],map.get(array[i])+1)
 * }
 * else {
 *   map.put(array[i], 1);
 * }
 * }
 * 
 * 
 * 
 */