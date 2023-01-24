import java.util.ArrayList;
import java.util.LinkedList;

import dp.stairs;

public class kMean {


    public static void main(String[] args) {
      int dataset[] = {2,4,10,12,3,5,25};
      int cluster = 2;
      int n = dataset.length;
      findKMean(dataset,cluster,n);
    }    

    public static  void findKMean(int array[],int c, int n){
       

        LinkedList<LinkedList<Integer>> clsuter = new LinkedList<>();

    
        int u[] = new int[c];

        for(int i=0;i<c;i++){
            u[i] = array[i];
            clsuter.add(new LinkedList<>());
        }




    }
}
