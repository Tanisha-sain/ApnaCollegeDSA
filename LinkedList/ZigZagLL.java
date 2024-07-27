package Linkedlist;

public class ZigZagLL {

    static Node getMid(Node head){
        Node slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node reverse(Node node){
        if(node == null || node.next == null) return node;
        Node curr = node, prev = null, nxt = null;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public static void zigZag(LinkedList list){
        if(list.head == null || list.head.next == null || list.head.next.next == null) return;
        Node mid = getMid(list.head);
        Node left = list.head;
        Node right = reverse(mid.next);
        mid.next = null;

        while(left != null && right != null){
            Node temp1 = left.next;
            left.next = right;
            left = temp1;

            Node temp2 = right.next;
            right.next = left;
            right = temp2;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 1; i<=5; i++){
            list.addLast(i);
        }
        zigZag(list);
        list.printList();
    }
}
