import java.util.HashMap;
// import java.util.HashSet;

public class sortElmByFreq {
    public static void main(String[] args) {
     // int[] arr = {1,2,3,2,4,3,1,2};
        int[] arr = {5,5,5,1,2,4,1,2,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
            System.out.println(map);
        }
        map.put(10, 1212);
        map.put(6, 233);
        map.put(6, 234);
        // System.out.println(map.);
          System.out.println(map.size());
        // for(int j=0;j<arr.length;j++){
        //     if(map.containsKey(arr[j])){
        //         int n=map.containsValue(con);
        //         while(n>0){
        //             // if(map.get(j))
        //             System.out.println(map.get(j)); // j ni aave vicharo ;
        //             n--;
        //         }
        //         n=0;

        //     }
        // }

    }
}
