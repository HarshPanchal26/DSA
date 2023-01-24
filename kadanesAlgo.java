public class kadanesAlgo {
    
    public static int kadane(int array[]){

        int max = Integer.MIN_VALUE;

        int sum = 1;
        for(int i=0;i<array.length;i++){

            sum *= array[i];

            if(sum>max){
                max = sum;
            }
            if(sum<0) {
                sum=0 ;
            }   
        }
        return sum;
    }

//     int msf=Integer.MIN_VALUE , meh=0 ; 
    
//     for(int i=0;i<array.length;i++){ 
//         meh+=array[i]; 
        
//         if(meh>msf)
//         { 
//             // subarray.clear();
//             msf=meh; 
//             // subarray.add(s); 
//             // subarray.add(i); 
//         } 
//         if(meh<0)
//         {
//             meh=0; 
//         } 
//     } 

//     return msf; 
// } 
    public static void main(String[] args) {
        // int array[]  = {-2,1,-3,4,-1,2,1,-5,4};
        int array[]  = {-1,2,3,4,5,0,6};
        System.out.println(kadane(array));
    }
}
