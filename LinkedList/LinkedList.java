package Linkedlist;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    Node tail;
    int size;

    public void addFirst(int val){
        Node curr = new Node(val);
        curr.next = head;
        head = curr;
        if(tail == null) tail = head;
        size++;
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
        size++;
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
        size++;
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("Can not remove element from empty linked list.");
            return Integer.MAX_VALUE;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int removeLast(){
        if(size > 0) size--;
        if(head == null || head.next == null){
            int data = (head == null) ? Integer.MAX_VALUE : head.data;
            head = null;
            tail = null;
            return data;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int data = temp.next.data;
        tail = temp;
        tail.next = null;
        return data;
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
        System.out.println();
    }

    public int iterSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key) return i;
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int rec(int key, Node temp, int i){
        if(temp == null) return -1;
        if(temp.data == key) return i;
        return rec(key,temp.next,i+1);
    }
    public int recSearch(int key){
        return rec(key, head, 0);
    }

    public void reverse(){
        Node curr = tail = head, prev = null, nxt = null;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList ll2 = new LinkedList();

        ll.addFirst(5);
        ll.addFirst(10);
        //System.out.println(ll.size);

        ll.addLast(9);
        ll.addLast(1); 
        ll.add(4,111);

        //System.out.println(ll.tail.data);
        // ll.printList();

        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeFirst());
        // System.out.println(ll.removeFirst());
        ll.printList();

        // System.out.println(ll.size);
        // System.out.println(ll2.size);

        System.out.println(ll.iterSearch(9));
        System.out.println(ll.iterSearch(0));


        for(int i = 1; i<6; i++){
            ll2.addLast(i);
        }
        System.out.println(ll2.recSearch(3));

        ll.reverse();
        ll.printList();
        System.out.println(ll.tail.data + " " + ll.head.data);

    }
}
