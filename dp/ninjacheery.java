package dp;
class ninjacheery{
 
    public static int pickup(int array[][], int n,int m ){
     int dp[][][] = new  int[n][m][m];

     for(int j1=0;j1<m;j1++){
        for(int j2=0;j2<m;j2++){
            if(j1==j2)
            dp[n-1][j1][j1] = array[n-1][j1];
            else 
            dp[n-1][j1][j2] = array[n-1][j1] + array[n-1][j2];
        }
     }

     for(int i = n-2 ; i>=0 ; i--){
        for(int j1=0; j1<m ; j1++){
            for(int j2=0;j2<m;j2++){

                int maxi = Integer.MIN_VALUE;

                
                for(int d1=-1 ; d1<=1 ; d1++){
                    for (int d2=-1; d2<=1 ;d2++){

                        int ans ;

                        if(j1==j2) ans = array[i][j1];

                        else  ans = array[i][j1] + array[i][j2];

                        if((j1+d1<0 || j1+d2 > m )||(j2+d1 < 0 || j2 + d2 > m )){
                            ans+=(int) Math.pow(-10, 9);
                        } else {
                            ans+=dp[i+1][j1][j2];
                        }
                        maxi = Math.max(maxi, ans);
                }
            }
            dp[i][j1][j2] = maxi;
        }
     }

    }
    return dp[0][0][m-1];


    }
    
        public static void main(String[] args) {
            int choco[][] = {{2,3,1,2},
                             {3,4,2,2,},
                             {5,6,3,5}};
            int n = choco.length;
            int m = choco[0].length;
            System.out.println(pickup(choco, n, m ));
        }
}