public class StackDesign {
    class Stack{
        int []A;
        int t ;
    Stack(int cap){
        A = new int[cap];
        t = -1;}
        public void push(int x){
            t++;
            A[t]=x;

        }
        public int pop(){
        t--;
            return A[t];
        }
        public int peek(){
        return A[t];
        }
        public int size(){
        return t ;
        }

    }
    public static void main(String[] args) {
        StackDesign.Stack stack = new StackDesign().new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
