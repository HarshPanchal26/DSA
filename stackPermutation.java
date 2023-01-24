import java.util.Stack;

public class stackPermutation {
    public static void main(String[] args) {
        int ip[] = { 1, 2, 3 };
        int op[] = { 3, 1, 2 };

        boolean result = false;

        Stack<Integer> stack = new Stack<>();

        int j = 0;

        for (int i = 0; i < ip.length; i++) {

            stack.push(ip[i]);

            while (!stack.isEmpty() && stack.peek() == op[j]) {
                stack.pop();
                j++;
            }

        }
        if (stack.isEmpty())
            result = true;

        System.out.println(result);

    }
}
