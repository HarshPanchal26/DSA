// package dp;

// import java.util.ArrayList;

// public class kthSumOfSubArray2 {
//     public static ArrayList<Integer> findKthMax(int array[], int idx){
//         ArrayList<Integer> list = new ArrayList<>();
        
//         int take = array[idx] + findKthMax(array, idx-1);

//         int nottake = findKthMax(array, idx-2);

//     }
//     public static void main(String[] args) {
//         int array[] = {5,4,-8,6};
//         // System.out.println(findKthMax(array,3));
//         ArrayList<Integer> result = findKthMax(array, array.length-1);
//     }
// }
