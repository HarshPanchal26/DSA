public class maxproduct {
    public static void main(String[] args) {
        int array[] = {1,2,-3,0,-4,-5};
        int max = array[0];
        for(int i=1;i<array.length-1;i++){
            int product = array[i];   
            if(array[i]!=0){
                for(int j=i+1;j<array.length;j++){
                    if(array[j]!=0){

                        product *= array[j];
                        if(product<max){
                            break;
                        }
                        else{
                            max=Math.max(max, product);
                        }
                        
                    }
                }
            }
        }
        System.out.println(max);
    }
}
