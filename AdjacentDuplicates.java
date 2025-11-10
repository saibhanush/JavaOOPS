import java.util.*;
public class AdjacentDuplicates {
    public static void main(String[] args) {
        String s = "abbacd";
        System.out.println(Removeadjacentchars(s));
    }
    public static String Removeadjacentchars(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i =1 ;i<s.length();i++){
            if(!stack.isEmpty()&&s.charAt(i)==stack.peek()){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
