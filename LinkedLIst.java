import java.security.PublicKey;

public class LinkedLIst {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    Node head;
    public void add(int d) {   //create list / add at tail
        Node nn = new Node(d);
        if(head == null) {
            head = nn;
        }
        else {
          Node temp = head;
          while(temp.next != null) {
              temp = temp.next;
          }
          temp.next = nn;
        }
    }
    public void addaathead(int d) { //add at head
        Node nn = new Node(d);
        nn.next = head;
        head = nn;
    }
    public void print() {  //print
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void Insert(int d, int n) { //Insert at head + at idx
        Node nn = new Node(d);


        if (n == 0) {//insert at head
            nn.next = head;
            head = nn;
            return;
        }


        Node temp = head;
        for (int j = 0;temp !=null && j < n - 1; j++) {
            temp = temp.next;
        }

        nn.next = temp.next;
        temp.next = nn;
    }
    public void delete(int n) { //delete by index
        Node temp = head;
        if(n==0){
            head = head.next;
        }
        else{
            for(int i=0;temp !=null&&i<n;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    public void reverse() {//reverse
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }
    public void Deletedata(int d) { //delete data
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == d) {//delete at head
            head = head.next;
            return;
        }

        Node prev = head;
        Node current = head.next;

        while (current != null) {//delete at data
            if (current.data == d) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println("Data not found in list");
    }
    public int searchfromtail(int idx){
        Node temp = head;
        Node current = head;
        int k = 0;
        while(temp!=null){
            temp = temp.next;
            k++;
            if(k>idx){
                current = current.next;
            }
        }
        return current.data;
    }
    public static void main(String[] args) {

    LinkedLIst ll = new LinkedLIst();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
        System.out.println(ll.searchfromtail(3));
    ll.print();

    }
}