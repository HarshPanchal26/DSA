import java.util.ArrayList;

public  class pascale {
    // public static ArrayList<ArrayList<Integer>> fun(int numRows){
       
    //     ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    //     ArrayList<Integer> row, pre = null;
    //     for (int i = 0; i < numRows; ++i) {
    //         row = new ArrayList<Integer>();
    //         for (int j = 0; j <= i; ++j){

    //             if (j == 0 || j == i)
    //             row.add(1);
    //             else
    //             row.add(pre.get(j - 1) + pre.get(j));
    //             pre = row;
    //             res.add(row);
    //         }
    //     }
    //     return res;



    public static ArrayList<ArrayList<Integer>> fun(int numRows) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j){

                if (j == 0 || j == i)
                row.add(1);
                else
                row.add(pre.get(j - 1) + pre.get(j));
                pre = row;
            }
			res.add(row);
		}
		return res;
    }

    public static void main(String[] args) {
        System.out.println(fun(5));
    }
}  
    


/*
1 
11 
121
1331
14641
*/ 