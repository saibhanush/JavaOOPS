import java.util.*;
public class Queue {
    //Queue Design using Stack
    Stack<Integer> stack = new Stack<>();

    public void add(int x){
        stack.push(x);
    }
    public int remove(){
        Stack<Integer> temp = new Stack<>();
        if(stack.size() == 0){
            return -1;
        }
        while(stack.size() > 1){
            temp.push(stack.pop());}
            int ans = stack.pop();
        while(temp.size() > 0){
            stack.push(temp.pop());}
        return ans;
    }
    public int peek(){
        Stack<Integer> temp = new Stack<>();
        if(stack.size() == 0){
            return -1;
        }
        while(stack.size() > 1){
            temp.push(stack.pop());}
        int ans = stack.peek();
        while(temp.size() > 0){
            stack.push(temp.pop());}
        return ans;
    }
    public int size(){
        return stack.size();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}