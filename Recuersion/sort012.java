package Recuersion;

public class sort012 {
    public static void main(String[] args) {
        int array[] = {1,1,0,2,1,2,0,0};
        sort012(array,array.length);
        for (int i : array) {
            System.out.print(i + " ");   
           }
    }
    public static void sort012(int []a, int n){

         // code here 
         int left=0,mid=0,right=n-1;
         for(int i=0;i<n;i++){
             if(a[mid]==0){
                 swap(a[left],a[mid]);
                 left++;
                 mid++;
             }
             else if(a[mid]==1){
                  mid++;
             }
             else if(a[mid]==2){
                 swap(a[mid],a[right]);
                 right--;
        }

    }  
    }
    public static void swap(int a, int b){
        System.out.println(a +" "+  b);
        int tmp = a ;
        a=b;
        b=tmp;
    }
}
