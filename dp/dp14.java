package dp;

public class dp14 {
    public static boolean find(int array[], int target, int n) {
        if (target == 0)
            return true;

        if (n == 0)
            return array[0] == target;

        boolean nottake = find(array, target, n - 1);

        boolean take = false;
        if (target >= array[n])
            take = find(array, target - array[n], n - 1);

        return nottake || take;

    }
    
    public static void main(String[] args) {
        int array[] = { 2, 0, -2, 4 };
        // int dp [][]=
        boolean result = find(array, 5, array.length - 1);
        System.out.println(result);
    }
}
