import java.util.Stack;

public class ClosedBrackets {

    public static boolean balancedBrackets(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    return false;
                }
                if (isCompatible(ch, st.peek())) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static boolean isCompatible(char ch, char peek) {
        if (ch == ')') {
            return peek == '(';
        } else if (ch == ']') {
            return peek == '[';
        } else if (ch == '}') {
            return peek == '{';
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {
                "()",
                "()[]{}",
                "([{}])",
                "({[]})",
                "(]",
                "([)]",
                "(",
                ")",
                "",
                "((()))",
                "{[()]}"
        };

        System.out.println("Balanced Brackets Test Results:");
        System.out.println("===============================");

        for (String test : testStrings) {
            boolean result = balancedBrackets(test);
            System.out.printf("'%s' -> %s%n", test, result ? "Balanced" : "Not Balanced");
        }
    }
}