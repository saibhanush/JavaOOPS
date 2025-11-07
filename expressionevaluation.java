import java.util.Scanner;
import java.util.Stack;

public class expressionevaluation {
    public static void main(String[] args) {
        // Fixed array initialization
        String[] s = new String[]{"5", "2", "+", "3", "2", "-", "-"};
        int result = Evaluation(s);
        System.out.println("Result: " + result); // Print the result
    }

    public static int Evaluation(String[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i].equals("+") || A[i].equals("-") || A[i].equals("*") || A[i].equals("/")) {
                // Important: pop in correct order - v2 first, then v1
                int v2 = stack.pop();
                int v1 = stack.pop();
                int ans = operation(v1, v2, A[i]);
                stack.push(ans);
            } else {
                int val = Integer.parseInt(A[i]);
                stack.push(val);
            }
        }
        return stack.peek();
    }

    public static int operation(int A, int B, String op) {
        switch (op) {
            case "+":
                return A + B;
            case "-":
                return A - B; // A - B (not B - A)
            case "*":
                return A * B;
            case "/":
                if (B == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return A / B; // A / B (not B / A)
            default:
                throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }
}