public class StackDesignLL {

    
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private int size = 0;

    // Push operation
    public void push(int data) {
        Node temp = new Node(data);
        size++;
        temp.next = head;
        head = temp;
        System.out.println("Pushed: " + data);
    }

    // Pop operation
    public int pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return -1; // Return -1 to indicate error
        }
        int poppedValue = head.data;
        head = head.next;
        size--;
        System.out.println("Popped: " + poppedValue);
        return poppedValue;
    }

    // Peek operation - returns top element without removing
    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Get stack size
    public int getSize() {
        return size;
    }

    // Display stack elements
    public void display() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node current = head;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackDesignLL stack = new StackDesignLL();

        // Test the stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); // Should show: 30 20 10

        System.out.println("Top element: " + stack.peek()); // Should be 30
        System.out.println("Stack size: " + stack.getSize()); // Should be 3

        stack.pop(); // Removes 30
        stack.pop(); // Removes 20

        stack.display(); // Should show: 10

        System.out.println("Is stack empty? " + stack.isEmpty()); // Should be false

        stack.pop(); // Removes 10
        stack.pop(); // Should show "Stack Underflow"

        System.out.println("Is stack empty? " + stack.isEmpty()); // Should be true
    }
}