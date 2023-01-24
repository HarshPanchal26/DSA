// this approch only works for continuous same element
// two pointers approch 
public class removeDuplicate {
    public static void main(String[] args) {
        int array[] = {1,2,2,2,2,2,2,2,2,3,3};
        int k = f(array);
        for(int i=0;i<=k;i++){
            System.out.print(array[i] + " ");
        }
    }
    public static int f(int array[]){
        int j=0;
        for(int i=1;i<array.length;i++){
            if(array[j]!=array[i]){
                j++;
                array[j]=array[i];
            }

        }
        return j;
    }
}