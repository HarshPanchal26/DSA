

public class maxproduct3 {

  public static int product(int array[]){

    int lefttorigth = array[0];
    int righttoleft = array[0];
    boolean isZero = false ;
    int p =1 ;
    for (int i : array) {
        p*=i;
        // System.out.println("first loop" + p);
        if(i==0) {
            isZero=true ;
            p=1;
            continue;
        }
        lefttorigth = Math.max(p, lefttorigth);
        // System.out.println(lefttorigth);
    }

    p=1;

    for( int j=array.length-1;j>=0;j--){
        p*=array[j];
        // System.out.println("secoend loop" + p);
        if(array[j]==0){
            isZero=true;
            p=1;
            continue;
        }
        righttoleft = Math.max(p, righttoleft);
        // System.out.println(righttoleft);
    }
    if(isZero) return Math.max(Math.max(righttoleft, lefttorigth), 0);
    return Math.max(righttoleft, lefttorigth);
  }
    public static void main(String []args){
    int array[]  = {-1,2,3,4,5,0,6};
    System.out.println(product(array));
 }   
}
