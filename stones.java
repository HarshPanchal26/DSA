public class stones {


    // static int max = Integer.MAX_VALUE;

	public static int f(int array[][] ,int x, int y, int idx ){
        // max = Math.min(max, num);  
		// System.out.println(idx + " " + x + " " + y);  
	    if(idx==0){
	        System.out.println("hi");
			if(x<=array[0][idx] && y>=array[1][idx]) 
			{
				System.out.println("hi21");
				return 1;
		}
            else return 0;
	    }
	    if(x<=0 && y<=0) return 0;
	    int pick =0;
        if(x<0 && y>0)
         pick  += f(array,x,y-array[1][idx],idx-1);
        else if(x>0 && y<0)
         pick  += f(array,x-array[0][idx],y,idx-1);
        else pick  += f(array,x-array[0][idx],y-array[1][idx],idx-1);
        
        // System.out.println(pick);
        int notpick = f(array,x,y,idx-1);
        // System.out.println(notpick);
        
        // System.out.print(result);
        int result = pick + notpick;
		
	    return result;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N=3;
		int X=6;
		int Y=5;
		// int array[][] = {{1,0,6,4,5},{8,7,1,9,1}};
		int array[][] = {{1,1,4},
		                 {2,1,2}};
		int find = f(array,X,Y,N-1);
        System.out.println(find);
	}
}


