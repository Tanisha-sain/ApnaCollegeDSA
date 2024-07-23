package LinkedList;

public class MergeSortLL {
    static Node middleNode(Node head){
        Node slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node merge(Node left, Node right){
        if(left == null) return right;
        if(right == null) return left;

        Node dummy = new Node(-1);
        Node temp = dummy;

        while(left != null && right != null){
            if(left.data < right.data){
                temp.next = left;
                left = left.next;
            }else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if(left == null) temp.next = right;
        if(right == null) temp.next = left;
        return dummy.next;
    }

    // O(nlogn)
    static Node mergeSort(Node head){
        if(head == null || head.next == null) return head;

        // find mid
        Node mid = middleNode(head);

        // left & right merge sort
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(left);
        Node newRight = mergeSort(right);

        // merge left & right sorted list
        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(9);
        list.addLast(10);
        list.addLast(1);
        list.addLast(0);
        list.addLast(7);
        list.addLast(3);
        list.head = mergeSort(list.head);
        list.printList();
    }
}
