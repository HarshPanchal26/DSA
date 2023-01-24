package dp;

public class chocolate {
public static int find(int n , int k ,int bite){

    // if(n==k) return bite+1 ;
    // if(n==0) return 0;
    // if(n<k) return -1;
    // // if(n==0) return bite ;

    // return find(n-k, k, bite+1);

    /*
     * if(n==0)v return 0;
     * if(n<=k){
     * if(n==k) return 1;
     * else return -1;
     * }
     * int pick= 0 + find(n-k,k);
     * return pick;
     */
    int ln[] = new int[n+1];
    ln[0] = 0;
    for(int i=1;i<=k;i++){
       if(i==k) ln[i] = 1;
       else ln[i]=-1;
    //    else break;
       
    }

    int pick = 0; 
    for(int i=k+1;i<=ln.length;i++){
        // if(k<=i)
        pick = ln[i-k];
    }
    for(int i=0;i<ln.length;i++){
        System.out.print(" " + ln[i]);
    }
    System.out.println();
    return pick;
    
}
    public static void main(String[] args) {
        int bite = 0;
	    int N=6;
		int K=2;
		bite = find(N,K,bite);
        System.out.println(bite);
    }
}
