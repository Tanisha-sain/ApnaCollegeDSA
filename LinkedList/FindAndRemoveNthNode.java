package LinkedList;

public class FindAndRemoveNthNode{

    // public Node removeFromStart(int n, LinkedList list){
    //     Node head = list.head;
    //     Node temp = head;
    //     if(head == null) return null;
    //     if(n == 0) return head.next;
    //     for(int i = 0; i<n-1; i++){
    //         temp = temp.next;
    //     }
    //     temp.next = temp.next.next;
    //     return head;
    // }
    public static void removeFromStart(int n, LinkedList list){
        if(list.size > 0) list.size--;
        Node head = list.head;
        Node temp = head;
        if(head == null) return;
        if(n == 1){
            list.head = list.head.next;
            return;
        }
        for(int i = 1; i<n-1; i++){
            temp = temp.next;
            if(temp == null || temp.next == null){
                System.out.println("index out of range");
                return;
            }
        }
        temp.next = temp.next.next;
        if(temp.next == null) list.tail = temp;
    }

    public static void removeFromEnd(int n, LinkedList list){
        int s = list.size - n + 1;
        removeFromStart(s, list);
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 1; i<9; i++){
            list.addLast(i*i - 2*i);
        }
        list.printList();
        removeFromEnd(1,list);
        removeFromEnd(3, list);
        list.printList();
        System.out.println(list.head.data + " " + list.tail.data);
    }
}