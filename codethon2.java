public class codethon2 {
    public static void findtheSpeed(int target){

        int array[] = new int[target];
        array[0] = 1 ;
        array[1] = 2 ;
        array[2] = 3 ;
        for(int i=3;i<target;i++){
            if(i%2==0) array[i] = array[i-2]*3;
            else array[i] = array[i-2]*2;  
        }
        // System.out.println(array[target-1]);
        for (int i : array) {
            System.out.print(" " + i);
        }
    } 
    public static void main(String[] args){
    int target = 12;
    findtheSpeed(target);
 }   
}
