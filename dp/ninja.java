//  for memoization prefer ninjmemo

package dp;
public class ninja{

public static int ninjapoint(int day , int last , int size, int[][] points) {
    if(day==0){
        int mini = 0;
        for(int i=0;i<size;i++){
            if(i!=last){
                mini = Math.max(mini,points[0][i]);
            }
        }
        return mini;
    }

    int pointer =0 ;
    int mini ;
    for(int j=0;j<size;j++){
        if(j!=last){
            mini = points[day][j] + ninjapoint(day-1,j, size, points);
            pointer = Math.max(mini, pointer);
        }
    }
    return pointer;
}  
 public static void main(String[] args) {
    int[][] points = {{10,40,70},
                      {20,50,80},
                      {30,60,10}};
    int n = points.length; 
    System.out.println("Maximum point ninja can get is :" +  ninjapoint(n-1,3,n,points));    
    // System.out.println(n); 

}   
}

//  this solution is not an optimal solution 
//  time complexit : 

// Time Complexity: O(N*4*3)

// Reason: There are N*4 states and for every state, we are running a for loop iterating three times.

// Space Complexity: O(N) + O(N*4)

// Reason: We are using a recursion stack space(O(N)) and a 2D array (again O(N*4)). Therefore total space complexity will be O(N*3) (pakku nathi) 