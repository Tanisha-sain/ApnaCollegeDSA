package LinkedList;

public class DoublyLinkedList {
    private class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node tail;

    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("Can't remove from empty list");
            return Integer.MAX_VALUE;
        }
        int data = head.data;
        head = head.next;
        head.prev = null;
        if(head == null) tail = null;
        return data;
    }
    public int removeLast(){
        if(tail == null){
            System.out.println("Can't remove from empty list");
            return Integer.MAX_VALUE;
        }
        int data = tail.data;
        tail = tail.prev;
        tail.next = null;
        if(tail == null) head = null;
        return data;
    }

    static void printDoublyLL(Node head){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(4);
        dll.addFirst(6);
        dll.addLast(9);
        dll.addLast(11);
        dll.addFirst(7);
        dll.addLast(10);
        dll.addFirst(8);
        printDoublyLL(dll.head);

        dll.removeFirst();
        dll.removeFirst();
        dll.removeLast();
        dll.removeLast();
        printDoublyLL(dll.head);
        System.out.println(dll.head.data + " " + dll.tail.data);
    }
}
