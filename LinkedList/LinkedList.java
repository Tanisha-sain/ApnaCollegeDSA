package LinkedList;

public class LinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void addFirst(int val){
        Node curr = new Node(val);
        curr.next = head;
        head = curr;
        if(tail == null) tail = head;
    }
    public void addLast(int val){
        Node curr = new Node(val);
        if(tail == null && head == null){
            head = curr;
            tail = head;
        }else{
            tail.next = curr;
            tail = tail.next;
        }
    }
    public void add(int index, int val){
        if(index == 0){
            addFirst(val);
            return;
        }
        Node curr = new Node(val);
        Node temp = head;
        for(int i = 0; i<index-1; i++) temp = temp.next;
        curr.next = temp.next;
        temp.next = curr;
        if(curr.next == null) tail = curr;
    }

    public void printList(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node h = head;
        while(h != null){
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(10);
        ll.addLast(9);
        ll.addLast(1); 
        ll.add(4,111);
        //System.out.println(ll.tail.data);
        ll.printList();

    }
}
